package com.libreria.modelo;

public class Libro {
	private int id;
	private  String titulo;
	private  String editorial;
	private  String autor;
	private  String genero;
	private  String edicion;
	private  String idioma;
	private  String isbn;
	private  boolean catalogo;
	
	public Libro() {
		
	}

	public boolean isCatalogo() {
		return catalogo;
	}

	public void setCatalogo(boolean catalogo) {
		this.catalogo = catalogo;
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Libro(int id, String titulo, String editorial, String autor, String genero, String edicion, String idioma,
			String isbn, boolean catalogo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.editorial = editorial;
		this.autor = autor;
		this.genero = genero;
		this.edicion = edicion;
		this.idioma = idioma;
		this.isbn = isbn;
		this.catalogo = catalogo;
	}
	
}
