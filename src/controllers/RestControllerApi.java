package controllers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.BirthdayChecker;
import model.Customer;
import model.CustomerDoa;
import model.Note;


@RestController
@RequestMapping("/api/")
public class RestControllerApi {
	
	@RequestMapping(value="customers", method = RequestMethod.GET)
	public List<Customer> ritten() {
		
		return CustomerDoa.findAll();
	}
	
//	@RequestMapping(value="notes, method=RequestMethod.GET)
//	public List<Note> allNotes(){
//		List<Customer> customers =CustomerDoa.findAll();
//		
//	}
	
	@RequestMapping(value="notes/{customerId}", method=RequestMethod.GET)
	public List<Note> notes(@PathVariable String customerId) {
		Long key;
		try{
			key = Long.valueOf(customerId);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		Customer customer = CustomerDoa.findCustomer(key);
		return customer.getNotes();
	}
	
	@RequestMapping(value="birthdays", method = RequestMethod.GET)
	public List<Date> birthdays() {
		List<Date> birthdays = new ArrayList<Date>();
		List<Customer> customers = CustomerDoa.findAll();
		for(Customer c : customers){
			birthdays.add(c.getBirthday());
		}
		return birthdays;
	}
	
	@RequestMapping(value="birthdays/{days}", method = RequestMethod.GET)
	public List<Customer> upcomimgBirthdays(@PathVariable int days) {
		List<Customer> bdayCustomers = new ArrayList<Customer>();
		List<Customer> customers = CustomerDoa.findAll();
		for(Customer c : customers){
			if(BirthdayChecker.isBdayInXDays(c, days)){
				bdayCustomers.add(c);
			}
		}
		return bdayCustomers;
	}
	
}
