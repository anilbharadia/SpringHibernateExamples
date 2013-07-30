package org.rw.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Person")
public class Person implements Serializable {
	
	private static final long serialVersionUID = 4776683158475479656L;
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Long id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="DOB")
	private Timestamp dob;
	
	
	public Person() {
		
	}

	public Person(Long id, String firstName, String lastName, String gender, Timestamp dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
	}


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
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public Timestamp getDob() {
		return dob;
	}
	public void setDob(Timestamp dob) {
		this.dob = dob;
	}
	
	
	@Override
	public String toString() {
		StringBuffer person = new StringBuffer();
		
		person.append("{");
			person.append("id:" + id + ",");
			person.append("firstName:" + firstName + ",");
			person.append("lastName:" + lastName + ",");
			person.append("gender:" + gender + ",");
			person.append("dob:" + dob + ",");
		person.append("}");
		
		return person.toString();
	}
	
	
}
