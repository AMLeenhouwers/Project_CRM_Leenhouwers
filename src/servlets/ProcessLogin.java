package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;


/**
 * Servlet implementation class ProcessLogin
 */
@WebServlet("/ProcessLogin")
public class ProcessLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessLogin() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
//			doGet(request, response);
			processRequest(request, response);
		}
		
		protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ServletContext context = getServletContext(); 
			String name = request.getParameter("userName");
			HttpSession session = request.getSession(); //create session			
			User user = new User();
			user.setName(name);
			session.setAttribute("user", user);	
			Cookie idCookie = new Cookie("idCookie", name);
			idCookie.setMaxAge(7*24*60*60);
			response.addCookie(idCookie);		
			context.getRequestDispatcher("/WEB-INF/jsp/MainMenu.jsp").forward(request, response);	
		}

	}
