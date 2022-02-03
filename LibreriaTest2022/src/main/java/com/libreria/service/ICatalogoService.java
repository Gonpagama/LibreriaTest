package com.libreria.service;

import java.util.List;

import com.libreria.modelo.Catalogo;

public interface ICatalogoService {
	public List<Catalogo>listar();
	public Catalogo listCatalogoId(int id);
	public int agregar(Catalogo c);
	public int editar(Catalogo c);
	public void borrar(int id);
	public int agregarlibrodecatalogo(Catalogo c, int id);
	public void borrarlibrodecatalogo(Catalogo c, int id);
}
