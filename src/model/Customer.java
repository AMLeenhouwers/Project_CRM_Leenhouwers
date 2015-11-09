package model;

import java.io.Serializable;

public class Customer implements Serializable {
	private String company;
	private String contactPerson;
	private Adres adres;
	private Adres billingAdres;
//	private Note[] notes;
	
	public Customer() {
		
	}
	
	public Customer(String company, String contactPerson, Adres adres, Adres billingAdres) {
		this.company = company;
		this.contactPerson = contactPerson;
		this.adres = adres;
		this.billingAdres =billingAdres;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public Adres getBillingAdres() {
		return billingAdres;
	}

	public void setBillingAdres(Adres billingAdres) {
		this.billingAdres = billingAdres;
	}
	
	
	
}
