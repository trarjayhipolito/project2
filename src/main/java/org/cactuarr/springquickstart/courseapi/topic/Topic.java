package org.cactuarr.springquickstart.courseapi.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String Id;
	private String name;
	private String description;
	
	public Topic() {
		
	}
	
	public Topic(String id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
