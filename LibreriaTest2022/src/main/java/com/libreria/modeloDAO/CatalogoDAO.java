package com.libreria.modeloDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.libreria.modelo.Catalogo;

@Repository
public class CatalogoDAO implements ICatalogo{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public List<Catalogo> listar() {
		String sql = "select * from catalogo";
		List<Catalogo> catalogos = template.query(sql, new BeanPropertyRowMapper<Catalogo>(Catalogo.class));
		return catalogos;
	}

	@Override
	public Catalogo listCatalogoId(int id) {
		String sql="select * from catalogo where id=?";
		@SuppressWarnings("deprecation")
		Catalogo cat=template.queryForObject(sql,new Object[] {id},new BeanPropertyRowMapper<Catalogo>(Catalogo.class));
		return cat;
	}

	@Override
	public int agregar(Catalogo c) {
		String sql = "insert into catalogo(titulo)values(?)";
		int cat = template.update(sql, c.getTitulo());
		return cat;
	}

	@Override
	public int editar(Catalogo c) {
		String sql="update catalogo set titulo=? where id=?";
		int cat=template.update(sql,c.getTitulo(),c.getId());
		return cat;
	}

	@Override
	public void borrar(int id) {
		String sql="delete from catalogo where id=?";
		template.update(sql,id);
		
	}

	@Override
	public int agregarlibrodecatalogo(Catalogo c, int id) {
		String sql = "insert into libroxcatalogo(idcatalogo, idlibro)values(?,?)";
		int cat = template.update(sql, c.getId(), id);
		return cat;
	}

	@Override
	public void borrarlibrodecatalogo(Catalogo c, int id) {
		String sql="delete from libroxcatalogo where idcatalogo=? and idlibro=?";
		template.update(sql, c.getId(), id);
		
	}

}
