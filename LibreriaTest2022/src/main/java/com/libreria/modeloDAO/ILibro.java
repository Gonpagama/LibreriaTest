package com.libreria.modeloDAO;

import java.util.List;

import com.libreria.modelo.Libro;

public interface ILibro {
	public List<Libro>listar();
	public Libro listLibroId(int id);
	public int agregar(Libro l);
	public int editar(Libro l);
	public void borrar(int id);
}
