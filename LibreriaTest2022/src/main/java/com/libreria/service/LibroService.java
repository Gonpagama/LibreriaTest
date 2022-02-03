package com.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.modelo.Libro;
import com.libreria.modeloDAO.ILibro;

@Service
public class LibroService implements ILibroService{

	@Autowired
	private ILibro dao;
	
	@Override
	public List<Libro> listar() {
		return dao.listar();
	}

	@Override
	public Libro listLibroId(int id) {
		return dao.listLibroId(id);
	}

	@Override
	public int agregar(Libro l) {
		dao.agregar(l);
		return 0;
	}

	@Override
	public int editar(Libro l) {
		dao.editar(l);
		return 0;
	}

	@Override
	public void borrar(int id) {
		dao.borrar(id);
		
	}

}
