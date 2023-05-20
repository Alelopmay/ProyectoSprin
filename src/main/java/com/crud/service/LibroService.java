package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.interfaceService.LibroInterfaceService;
import com.crud.interfaces.LibroInterface;
import com.crud.modelo.Libro;

import jakarta.transaction.Transactional;

@Service
public class LibroService implements LibroInterfaceService {

	@Autowired
	private LibroInterface data;

	@Override
	@Transactional
	public List<Libro> listar() {
		return (List<Libro>) data.findAll();
	}

	@Override
	@Transactional
	public void guardar(Libro libro) {
		data.save(libro);

	}

	@Override
	@Transactional
	public void eliminar(Libro libro) {
		data.delete(libro);

	}

	@Override
	@Transactional
	public Libro encontrarLibro(Libro libro) {

		return data.findById(libro.getId()).orElse(null);// si no encuentra el libro, devuelve un null

	}

}
