package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee103")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	
	@Column(name="employee_name")
	private String name;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Employee() {
		super();
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
