package com.libreria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class LibreriaTest2022Application implements CommandLineRunner{

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(LibreriaTest2022Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("DROP TABLE LIBRO IF EXISTS");
		template.execute("CREATE TABLE LIBRO(id INTEGER(11) PRIMARY KEY auto_increment,titulo VARCHAR(255),editorial VARCHAR(255),autor VARCHAR(255),genero VARCHAR(255),edicion VARCHAR(255),idioma VARCHAR(255),isbn VARCHAR(255),catalogo BOOLEAN)");

	}
}
