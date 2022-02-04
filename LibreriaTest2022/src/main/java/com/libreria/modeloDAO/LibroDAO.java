package com.libreria.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.libreria.modelo.Libro;

@Repository
public class LibroDAO implements ILibro{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Libro> listar() {
		String sql = "select * from libro";
		List<Libro> libros = template.query(sql, new BeanPropertyRowMapper<Libro>(Libro.class));
		return libros;
	}

	@Override
	public Libro listLibroId(int id) {
		String sql="select * from libro where id=?";
		@SuppressWarnings("deprecation")
		Libro lib=template.queryForObject(sql,new Object[] {id},new BeanPropertyRowMapper<Libro>(Libro.class));
		return lib;
	}

	@Override
	public int agregar(Libro l) {
		String sql = "insert into libro(titulo,editorial,autor,genero,edicion,idioma,isbn,catalogo)values(?,?,?,?,?,?,?,?)";
		int lib = template.update(sql, l.getTitulo(), l.getEditorial(), l.getAutor(), l.getGenero(), l.getEdicion(), l.getIdioma(), l.getIsbn(), l.isCatalogo());
		return lib;
	}

	@Override
	public int editar(Libro l) {
		String sql="update libro set titulo=?,editorial=?,autor=?,genero=?,edicion=?,idioma=?,isbn=?,catalogo=? where id=?";
		int lib=template.update(sql,l.getTitulo(), l.getEditorial(), l.getAutor(), l.getGenero(), l.getEdicion(), l.getIdioma(), l.getIsbn(), l.isCatalogo(),l.getId());
		return lib;
	}

	@Override
	public void borrar(int id) {
		String sql="delete from libro where id=?";
		template.update(sql,id);
		
	}

	
}
