package controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import model.Customer;
import model.CustomerDoa;
import model.Note;
import model.User;

@Controller
@SessionAttributes({"user"})
public class NotesManagement {
	
/*	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    SimpleDateFormat sdf = new SimpleDateFormat("E M hh:mm:ss zzz yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	*/
	
	@RequestMapping(value="/Secure/Notes/{id}", method=RequestMethod.GET)
	public String displayNotes(@PathVariable String id, Model model){
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
			return "DisplayNotes";
		}	
	}
	
	@RequestMapping(value="/Secure/Notes/{customerId}/AddNote", method=RequestMethod.GET)
	public String noteForm(@PathVariable String customerId, Model model, @ModelAttribute("user") User user){
		Long key;
		try{
			key = Long.valueOf(customerId);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}
		Note note = new Note();
		Date date = new Date();
		note.setDate(date);
		note.setUserName(user.getName());
		model.addAttribute("customer", CustomerDoa.findCustomer(key));
		model.addAttribute("note", note);
		return "AddNote";
	}
	
	@RequestMapping(value="/Secure/Notes/{customerId}/AddNote", method=RequestMethod.POST)
	public String addUser(@PathVariable String customerId, @ModelAttribute("note") Note note){
		Long key;
		try{
			key = Long.valueOf(customerId);
		}
		catch(NumberFormatException e){
			// id is geen getal? error 404
			return null;
		}	
	//	Customer customer = CustomerDoa.findCustomer(key);
	//	customer.getNotes().add(note);
		CustomerDoa.addNote(key, note);
		return "NewNoteAdded";
	}
	
	
//	@RequestMapping(value="/Secure/Notes/{customerId}/{noteId}", method=RequestMethod.GET)
//	public String displayNote(@PathVariable String customerId, Model model){
//		Long key;
//		try{
//			key = Long.valueOf(Id);
//		}
//		catch(NumberFormatException e){
//			// id is geen getal? error 404
//			return null;
//		}
//		Customer customer = CustomerDoa.findCustomer(key);
//		if(customer == null){
//			return null;
//		} else {
//			model.addAttribute("customer", customer);
//			return "DisplayNotes";
//		}
//		
//	}
	
	
	
	
}
