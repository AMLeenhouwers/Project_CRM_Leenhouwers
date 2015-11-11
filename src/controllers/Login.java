package controllers;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import model.User;


@Controller
@RequestMapping("/")
@SessionAttributes("user")
public class Login {
	
	@ModelAttribute("user")
	public User createUser() {
		return new User();
	}
	 
	@RequestMapping()
	public String login(@CookieValue(value = "idCookie", defaultValue = "") String name, Model model) {
		model.addAttribute("name",name);
		return "Login";
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String processLogin(HttpServletResponse response, @ModelAttribute("user") User user){
//	System.out.println(UserDoa.findUserByName(user.getName()));	
		Cookie idCookie = new Cookie("idCookie", user.getName());
		idCookie.setMaxAge(7*24*60*60);
		response.addCookie(idCookie);	
	//	if() return null;
		return "redirect:MainMenu";
	}
}


