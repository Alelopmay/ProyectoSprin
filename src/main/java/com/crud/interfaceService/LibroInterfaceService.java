package com.crud.interfaceService;

import java.util.List;
import java.util.Optional;

import com.crud.modelo.Libro;

public interface LibroInterfaceService {
	
	public List<Libro>listar();
	public void guardar(Libro libro);
	public void eliminar(Libro libro);
	public Libro encontrarLibro(Libro libro);
	
	

}
