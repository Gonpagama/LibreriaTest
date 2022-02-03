package com.libreria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libreria.modelo.Libro;
import com.libreria.service.ILibroService;


@Controller
public class LibroController {
	@Autowired
	private ILibroService service;

	@RequestMapping("/libro/listar")
	public String listar(Model model) {
		model.addAttribute("libros", service.listar());
		return "index";
	}

	@GetMapping("/libro/nuevo")
	public String nuevo() {
		return "agregarlibro";
	}
	@PostMapping("/libro/agregar")
	public String agregar(@Valid Libro l) {
		service.agregar(l);
		return "redirect:/libro/listar";
	}
	@GetMapping("/libro/editar/{id}")
	public String editar(@PathVariable int id, Model model){
		Libro libro=service.listLibroId(id);
		model.addAttribute("libro", libro);
		return "editarlibro";
	}
	@PostMapping("/libro/actualizar")
	public String actualizar(@Valid Libro l) {
		service.editar(l);
		return "redirect:/libro/listar";
	}
	@GetMapping("/libro/eliminar/{id}")
	public String borrar(@PathVariable int id) {
		service.borrar(id);
		return "redirect:/libro/listar";
	}
}
