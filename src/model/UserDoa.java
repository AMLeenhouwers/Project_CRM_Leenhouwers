package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDoa {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("user_db");
	
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
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		User user = em.createQuery("from User where name="+name, User.class).getSingleResult();
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
