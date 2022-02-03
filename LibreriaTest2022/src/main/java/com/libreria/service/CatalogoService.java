package com.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.modelo.Catalogo;
import com.libreria.modeloDAO.ICatalogo;

@Service
public class CatalogoService implements ICatalogoService{

	@Autowired
	private ICatalogo dao;
	
	@Override
	public List<Catalogo> listar() {
		return dao.listar();
	}

	@Override
	public Catalogo listCatalogoId(int id) {
		return dao.listCatalogoId(id);
	}

	@Override
	public int agregar(Catalogo c) {
		dao.agregar(c);
		return 0;
	}

	@Override
	public int editar(Catalogo c) {
		dao.editar(c);
		return 0;
	}

	@Override
	public void borrar(int id) {
		dao.borrar(id);
		
	}

	@Override
	public int agregarlibrodecatalogo(Catalogo c, int id) {
		dao.agregarlibrodecatalogo(c, id);
		return 0;
	}

	@Override
	public void borrarlibrodecatalogo(Catalogo c, int id) {
		dao.borrarlibrodecatalogo(c, id);
		
	}

}
