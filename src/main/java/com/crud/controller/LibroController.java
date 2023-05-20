package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.crud.interfaceService.LibroInterfaceService;
import com.crud.modelo.Libro;

@Controller
@RequestMapping
public class LibroController {

	@Autowired
	private LibroInterfaceService service;

	@GetMapping("/")
	public String listar(Model model) {
		var libros = service.listar();	
		model.addAttribute("Libros", libros);
		return "index";

	}

	@GetMapping("/agregar")
	public String agregar(Libro libro) {

		return "modificar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar (Libro libro,Model model) {		
		libro = service.encontrarLibro(libro);
		model.addAttribute("libro", libro);
		return "modificar";
		
		
	}
	@GetMapping("/eliminar/{id}")
	public String eliminar(Libro libro) {
		service.eliminar(libro);
		return "redirect:/";
	} 

	@PostMapping("/guardar")
	public String guardar(Libro libro) {

		service.guardar(libro);
		return "redirect:/";
	}
	

}
