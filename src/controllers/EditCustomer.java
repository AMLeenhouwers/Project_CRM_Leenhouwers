package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Customer;
import model.CustomerDoa;

@Controller
public class EditCustomer {
	
	@RequestMapping(value="/Secure/EditCustomer/{id}", method=RequestMethod.GET)
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
			return null;
		} else {
			model.addAttribute("customer", customer);
			return "EditCustomer";
		}
	}
	
	@RequestMapping(value="/Secure/EditCustomer/{id}", method=RequestMethod.POST)	
	public String editCustomer(@ModelAttribute ("customer") Customer formData, Model model){
		Customer customer = CustomerDoa.updateCustomer(formData);
		model.addAttribute("customer", customer);
		return "CustomerUpdated";
	}
	
	
}
