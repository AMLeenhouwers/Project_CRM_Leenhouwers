package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import model.CustomerDoa;

@Controller
public class RemoveCustomer {

	
	@RequestMapping(value="/RemoveCustomer/{id}")
	public String removeCustomer(@PathVariable String id, Model model) {
		Long key;
		try{
			key = Long.valueOf(id);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		CustomerDoa.removeCustomer(key);
			return "CustomerRemoved";
	}
	
}
