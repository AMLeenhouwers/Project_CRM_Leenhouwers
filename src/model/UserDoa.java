package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class UserDoa {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("customer_db");
	
	public static void addUser(User user) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(user);
		t.commit();
		em.close();			
	}
	
	public static void removeUser(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		User user = em.find(User.class, id);
		if(user != null) {		
			em.remove(user);
		}
		t.commit();
		em.close();	
	}
	
	public static User findUser(Long id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		User user = em.find(User.class, id);
		t.commit();
		em.close();	
		return user;
	}
	
	public static User findUserByName(String name){
		User user;
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try {
			TypedQuery<User> q = em.createQuery("from User u where u.name= :name", User.class);
			user = q.setParameter("name", name).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		t.commit();
		em.close();	
		return user;
	}
	
	
	public static List<User> findAll() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		List<User> allUsers = em.createQuery("from User", User.class).getResultList();
		t.commit();
		em.close();		
		return allUsers;
	}
}
