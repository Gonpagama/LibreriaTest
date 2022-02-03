package com.libreria.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.libreria.modelo.Catalogo;
import com.libreria.service.ICatalogoService;

@Controller
public class CatalogoController {
	@Autowired
	private ICatalogoService service;

	@RequestMapping("/catalogo/listar")
	public String listar(Model model) {
		model.addAttribute("catalogos", service.listar());
		return "index";
	}

	@GetMapping("/catalogo/nuevo")
	public String nuevo() {
		return "agregarcatalogo";
	}
	@PostMapping("/catalogo/agregar")
	public String agregar(@Valid Catalogo c) {
		service.agregar(c);
		return "redirect:/catalogo/listar";
	}
	@GetMapping("/catalogo/editar/{id}")
	public String editar(@PathVariable int id, Model model){
		Catalogo catalogo=service.listCatalogoId(id);
		model.addAttribute("catalogo", catalogo);
		return "editarcatalogo";
	}
	@PostMapping("/catalogo/actualizar")
	public String actualizar(@Valid Catalogo c) {
		service.editar(c);
		return "redirect:/catalogo/listar";
	}
	@GetMapping("/catalogo/eliminar/{id}")
	public String borrar(@PathVariable int id) {
		service.borrar(id);
		return "redirect:/catalogo/listar";
	}
}
