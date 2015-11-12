package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SearchCustomer {

	@RequestMapping(value="/Secure/SearchCustomer", method=RequestMethod.GET)
	public String displayCustomerSearch(){
		return "SearchCustomer";
	}
	
	@RequestMapping(value="/Secure/SearchCustomer", method=RequestMethod.POST)
	public String CustomerSearch(String contactPerson, String company, Model model){
		if(contactPerson.equals("") && company.equals("")) {
			String message = "Please enter one of the fields";
			model.addAttribute("message", message);
			return "Login";
		}
		return "DisplayCustomers";
	}
	
}
