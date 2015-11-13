package model;

import java.util.ArrayList;

public abstract class CustomerSearcher {

	public static ArrayList<ArrayList<Customer>> findCustomers(String contactPerson, String company){
		ArrayList<Customer> customers = new ArrayList<Customer>();
		if(contactPerson.equals("")) {
			customers.addAll(CustomerDoa.findCustomersByCompany(company));
		}	
			
		if(company.equals("")) {
			customers.addAll(CustomerDoa.findCustomersByContactPerson(contactPerson));
		}

		if(!contactPerson.equals("") && !company.equals("")) {
			customers.addAll(CustomerDoa.findCustomersByCompanyAndContactPerson(company, contactPerson));
//			customers.addAll(CustomerDoa.findCustomersByCompany(company));
//			customers.addAll(CustomerDoa.findCustomersByContactPerson(contactPerson));
		}
		
		ArrayList<ArrayList<Customer>> positionedCustomers = positionCustomers(customers);
		return positionedCustomers;
	}
	
	public static ArrayList<ArrayList<Customer>> positionCustomers(ArrayList<Customer> customers){
		ArrayList<ArrayList<Customer>> positionedCustomers = new ArrayList<ArrayList<Customer>>();
		for(int i = 0; i < customers.size(); i+=3){
			ArrayList<Customer> c = new ArrayList<Customer>();
			for (int j=0;j<3; j++){
				if (i+j<customers.size()) c.add(customers.get(i+j));
			}
			positionedCustomers.add(c);
			
		}
		return positionedCustomers; 
	}
	
}
