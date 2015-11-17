package controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Customer;
import model.CustomerDoa;

@Controller
public class NewCustomer {
	

	@RequestMapping(value="/Secure/NewCustomer", method=RequestMethod.GET)
	public String addEmptyCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "NewCustomer";
	}

	@RequestMapping(value="/Secure/NewCustomer", method=RequestMethod.POST)
	public String addNewCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
	        if(result.hasErrors()) {
	            return "NewCustomer";
	        }
		CustomerDoa.addCustomer(customer);
		model.addAttribute("customer", customer);
		return "CustomerUpdated";
	}
	
//	
//	@RequestMapping(value="/NewCustomerAdded", method=RequestMethod.POST)
//	public String newCustomerAdded(){
//		return "redirect:MainMenu";
//	}
	
}
