package model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
	private String company;
	private String contactPerson;
	private Adres adres;
	private Adres billingAdres;
	private String phoneNumber;
	private String faxNumber;
	private String email;
	private Date birthday;
//	private Note[] notes;
	
	private enum Relation {
		CUSTOMER, PARTNER, PROSPECT;
	}
	
	public Customer() {
		
	}
	
	public Customer(String company, String contactPerson, Adres adres, Adres billingAdres, String phoneNumber, String faxNumber, String email) {
		this.company = company;
		this.contactPerson = contactPerson;
		this.adres = adres;
		this.billingAdres = billingAdres;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.email = email;
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
