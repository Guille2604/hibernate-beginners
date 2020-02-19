package com.research24x7.hibernate.beginners.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity (name =  "Persona")
@Table (name = "persona")
public class Persona {


	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="persona_id", nullable=false, unique=true)
	private int id;

	@Column(name="nombre", nullable=false)
	private String nombre;

	@Column(name="apellido", nullable=false)
	private String apellido;

	@Column(name="dni", nullable=false)
	private String dni;

	@Column(name="email", nullable=false)
	private String email;

	@Column(name="telefono", nullable=false)
	private String telefono;


	public Persona() {

		super ();
	}

	public Persona(String nombre, String apellido, String dni, String email, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}