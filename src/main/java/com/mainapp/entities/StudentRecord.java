package com.mainapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "studentrecords")
@Data
@NoArgsConstructor
public class StudentRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	@Setter(value = AccessLevel.NONE)
	private int id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Department")
	private String department;
	
	@Column(name = "Country")
	private String country;
	

	public StudentRecord(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}
	
	
}