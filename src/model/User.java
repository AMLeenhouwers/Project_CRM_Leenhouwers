package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {
	private Long id;
	private String name;
	private String password;
	private boolean removePermission = false;
	private boolean addPermission = false;
	private boolean userPermission = false;

	public User() {
	//	super();
	}
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public User(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRemovePermission() {
		return removePermission;
	}

	public void setRemovePermission(boolean removePermission) {
		this.removePermission = removePermission;
	}

	public boolean isAddPermission() {
		return addPermission;
	}

	public void setAddPermission(boolean addPermission) {
		this.addPermission = addPermission;
	}

	public boolean isUserPermission() {
		return userPermission;
	}

	public void setUserPermission(boolean userPermission) {
		this.userPermission = userPermission;
	}

	
	
}
