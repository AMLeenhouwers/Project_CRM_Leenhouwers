package controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.Customer;
import model.CustomerSearcher;

@Controller
public class SearchCustomer {

	@RequestMapping(value="/Secure/SearchCustomer", method=RequestMethod.GET)
	public String displayCustomerSearch(){
		return "SearchCustomer";
	}
	
	@RequestMapping(value="/Secure/SearchCustomer", method=RequestMethod.POST)
	public String CustomerSearch(@RequestParam("contactPerson") String contactPerson, @RequestParam("company") String company, Model model){
		if(contactPerson.equals("") && company.equals("")) {
			String message = "Please enter one of the fields";
			model.addAttribute("message", message);
			return "SearchCustomer";
		}
		ArrayList<ArrayList<Customer>> customers = CustomerSearcher.findCustomers(contactPerson, company);
		if(customers.isEmpty()) {
			String message = "No customers found";
			model.addAttribute("message", message);
			return "SearchCustomer";
		}
		model.addAttribute("customers", customers);
		return "DisplayCustomers";
	}
	
}
