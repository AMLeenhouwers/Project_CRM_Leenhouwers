package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
	
	public static List<Customer> findCustomersByContactPerson(String name){
		List<Customer> customer;
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try {
			TypedQuery<Customer> q = em.createQuery("from Customer u where u.name= :name", Customer.class);
			customer = q.setParameter("name", name).getResultList();
		} catch (NoResultException e) {
			return null;
		}
		t.commit();
		em.close();	
		return customer;
	}
	
	public static List<Customer> findCustomersByCompany(String company){
		List<Customer> customer;
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try {
			TypedQuery<Customer> q = em.createQuery("from Customer u where u.company= :company", Customer.class);
			customer = q.setParameter("company", company).getResultList();
		} catch (NoResultException e) {
			return null;
		}
		t.commit();
		em.close();	
		return customer;
	}
	
	public static List<Customer> findAll() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<Customer> allCustomers = em.createQuery("from Customer", Customer.class).getResultList();
		t.commit();
		em.close();		
		return allCustomers;
	}
	
}
