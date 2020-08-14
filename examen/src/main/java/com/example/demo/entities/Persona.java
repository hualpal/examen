package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
	@Id
	Integer id;
	@Column
	String nombre;
	@Column
	String apellido;
	@Column
	Integer edad;
	@Column
	String email;
	@Column
	String password;
	@Column
	String fechaCreacion;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email="
				+ email + ", password=" + password + ", fechaCreacion=" + fechaCreacion + "]";
	}
	public Persona(Integer id, String nombre, String apellido, Integer edad, String email, String password,
			String fechaCreacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		this.password = password;
		this.fechaCreacion = fechaCreacion;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
