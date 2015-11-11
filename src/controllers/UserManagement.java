package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserManagement {

	@RequestMapping(value="/UserManagment")
	public String userManagementMenu(){
		
		return "UserManagement";
	}
	
	@RequestMapping(value="/UserManagment/AddUser", method=RequestMethod.GET)
	public String addUser(){
		
		return "AddUser";
	}
	
	@RequestMapping(value="/UserManagment/RemoveUser/${id}")
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
	
//	@RequestMapping(value="/UserManagment")
//	public String userManagementMenu(){
//		
//		return "UserManagement";
//	}
	
}
