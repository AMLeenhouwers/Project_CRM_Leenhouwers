package model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

//import java.util.Date;

@Entity
public class Customer {
//	private enum Relation {
//		CUSTOMER, PARTNER, PROSPECT;
//	}
	private Long id;
	private String company;
	private String contactPerson;
	private Adress adress;
	private Adress billingAdress;
	private String phoneNumber;
	private String mobileNumber;
	private String faxNumber;
	private String email;
//	private Date birthday;
	private ArrayList<Note> notes;

	public Customer() {
		notes = new ArrayList<Note>();
	}
//
//	public Customer(String company, String contactPerson, Adress adres, Adress billingAdres, String phoneNumber, String faxNumber, String email) {
//		this.company = company;
//		this.contactPerson = contactPerson;
//		this.adress = adres;
//		this.billingAdress = billingAdres;
//		this.phoneNumber = phoneNumber;
//		this.faxNumber = faxNumber;
//		this.email = email;
//	}

	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@OneToOne(cascade=CascadeType.ALL)
	public Adress getAdress() {
		return adress;
	}

	@OneToOne(cascade=CascadeType.ALL)
	public Adress getBillingAdress() {
		return billingAdress;
	}

	public String getCompany() {
		return company;
	}
	
	public String getContactPerson() {
		return contactPerson;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getFaxNumber() {
		return faxNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public void setBillingAdress(Adress billingAdress) {
		this.billingAdress = billingAdress;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//@OneToMany(cascade=CascadeType.ALL)
	public ArrayList<Note> getNotes() {
		return notes;
	}


	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}


	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
