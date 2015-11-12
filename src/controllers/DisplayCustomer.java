package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Customer;
import model.CustomerDoa;

@Controller
public class DisplayCustomer {
	
	@RequestMapping(value="/Secure/DisplayCustomer/{id}")
	public String displayCustomer(@PathVariable String id, Model model) {
		Long key;
		try{
			key = Long.valueOf(id);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		Customer customer = CustomerDoa.findCustomer(key);
		if(customer == null){
			// geen rit met gegeven id? error 404
			return null;
		} else {
			model.addAttribute("customer", customer);
			return "DisplayCustomer";
		}
	}
	
	
}
