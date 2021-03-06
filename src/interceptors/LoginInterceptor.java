package interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import model.User;
import model.UserValidator;
 
public class LoginInterceptor implements HandlerInterceptor  {
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
    	User user = (User) request.getSession().getAttribute("user");
    	if(user == null || !UserValidator.verifyUser(user)) {
    		response.sendRedirect("/Project_CRM_Leenhouwers/");
    	    return false;
    	}    
    	return true;
    }
     
    @Override
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
    }
     
    @Override
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }
}