package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainMenu {

	@RequestMapping("/MainMenu")
	public String makechoice(@RequestParam("submit") String choice){
		String toReturn = "";
		switch (choice){
		case ("Add new customer"): {
			toReturn = "AddCustomer";
		}
		}
		return toReturn;
	}
}
