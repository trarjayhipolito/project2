package org.cactuarr.springquickstart.courseapi.users;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
	
	@Id
	private Long Id;
	private String userName;
	private String firstName;
	private String lastName;
	private String description;
	
	public User() {
		
	}
	
	public User(Long id, String userName, String firstName, String lastName, String description) {
		super();
		Id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
