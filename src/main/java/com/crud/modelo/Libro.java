package com.crud.modelo;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "Libro")

public class Libro implements Serializable {
	
	private static final long serialVersionUID  = 1L;
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String isbn;
private String titulo;
private double precio;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}




}
