package com.libreria.modelo;

import java.util.List;

public class Catalogo {
	private int id;
	private  String titulo;
	private  List<Libro> libros;
	
public Catalogo() {
		
	}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public List<Libro> getLibros() {
	return libros;
}

public void setLibros(List<Libro> libros) {
	this.libros = libros;
}

public Catalogo(int id, String titulo) {
	super();
	this.id = id;
	this.titulo = titulo;
}

}
