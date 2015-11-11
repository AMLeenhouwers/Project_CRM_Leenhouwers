package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class CustomerDoa {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer_db");
	
	public static void addCustomer(Customer customer) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(customer.getAdress());
		em.persist(customer.getBillingAdress());
		em.persist(customer);
		t.commit();
		em.close();			
	}
	
	public static void removeCustomer(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Customer customer = em.find(Customer.class, id);
		if(customer != null) {
			em.remove(customer.getAdress());
			em.remove(customer.getBillingAdress());				
			em.remove(customer);
		}
		t.commit();
		em.close();	
	}
	
	public static Customer findCustomer(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		Customer customer = em.find(Customer.class, id);
		t.commit();
		em.close();	
		return customer;
	}
	
	public static List<Customer> findAll() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<Customer> allCustomers = em.createQuery("from customer", Customer.class).getResultList();
		t.commit();
		em.close();		
		return allCustomers;
	}
	
}
