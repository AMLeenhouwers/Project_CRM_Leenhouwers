package model;

import java.util.ArrayList;

public abstract class CustomerSearcher {

	public static ArrayList<Customer> findCustomers(String contactPerson, String company){
		ArrayList<Customer> customers = new ArrayList<Customer>();
		if(contactPerson.equals("")) {
			customers.addAll(CustomerDoa.findCustomersByCompany(company));
		}	
			
		if(company.equals("")) {
			customers.addAll(CustomerDoa.findCustomersByContactPerson(contactPerson));
		}

		if(!contactPerson.equals("") && !company.equals("")) {
			customers.addAll(CustomerDoa.findCustomersByCompany(company));
			customers.addAll(CustomerDoa.findCustomersByContactPerson(contactPerson));
		}
		
		return customers;
	}
}
