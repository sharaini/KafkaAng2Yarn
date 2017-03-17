package com.example.model;

import javax.persistence.*;
import javax.persistence.*;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="firstname")
	private String firstName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
