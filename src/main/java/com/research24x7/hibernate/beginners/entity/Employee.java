
package com.research24x7.hibernate.beginners.entity;


import lombok.*;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity (name =  "Employee")
@Table (name = "employee")
public class Employee {


	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="emp_id", nullable=false, unique=true)
	private int id;
	
	@Column(name="emp_name", length=28, nullable=false)
	private String name;
	
	@Column(name="emp_last_name", length=28, nullable=false)
	private String lastName;

	@Column(name="emp_dni",nullable=false)
	private Long dni;

	@Column(name="emp_email", nullable=false)
	private String email;

	@Column(name="emp_mobile", nullable=false)
	private String mobile;
}
