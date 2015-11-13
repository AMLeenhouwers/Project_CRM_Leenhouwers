package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.User;
import model.UserDoa;

@Controller
public class UserManagement {

	@RequestMapping(value="/Secure/UserManagement")
	public String userManagementMenu(){
		
		return "UserManagement";
	}
	
	@RequestMapping(value="/Secure/UserManagement/NewUser", method=RequestMethod.GET)
	public String UserForm(Model model){
		User user = new User();
		model.addAttribute("newUser", user);
		return "NewUser";
	}
	
	@RequestMapping(value="/Secure/UserManagement/NewUser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user){
		UserDoa.addUser(user);
		return "NewUserAdded";
	}
	
	
	@RequestMapping(value="/Secure/UserManagement/RemoveUser/${id}")
	public String removeUser(@PathVariable String id, Model model) {
			Long key;
			try{
				key = Long.valueOf(id);
			}
			catch(NumberFormatException e){
				// id is geen getal? error 404
				return null;
			}
			UserDoa.removeUser(key);
				return "UserRemoved";
	}
	
	@RequestMapping(value="/Secure/UserManagment/DisplayUsers")
	public String displayUsers(Model model){
		model.addAttribute("users", UserDoa.findAll());
		return "DisplayUsers";
	}
	
}
