package controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
		model.addAttribute("user", user);
		return "NewUser";
	}
	
	@RequestMapping(value="/Secure/UserManagement/NewUser", method=RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("user") User user, BindingResult result, Model model){
/*		if(UserDoa.findUserByName(user.getName()).equals(user.getName())) {
			String message = "Username already exists, please try a different username";
			model.addAttribute("message", message);
			return "newUser";
		}*/
        if(result.hasErrors()) {
            return "NewUser";
        }
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
	
	@RequestMapping(value="/Secure/UserManagement/{id}", method=RequestMethod.GET)
	public String displayCustomer(@PathVariable String id, Model model) {
		Long key;
		try{
			key = Long.valueOf(id);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		User user = UserDoa.findUser(key);
		if(user == null){
			return null;
		} else {
			model.addAttribute("editUser", user);
			return "EditUser";
		}
	}
	
	@RequestMapping(value="/Secure/UserManagement/{id}", method=RequestMethod.POST)	
	public String editCustomer(@ModelAttribute ("editUser") User formData, Model model){
		UserDoa.updateUser(formData);
		return "UserUpdated";
	}
	
	@RequestMapping(value="/Secure/UserManagement/DisplayUsers")
	public String displayUsers(Model model){
		model.addAttribute("users", UserDoa.findAll());
		return "DisplayUsers";
	}
	
}
