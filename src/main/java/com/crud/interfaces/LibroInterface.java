package com.crud.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.modelo.Libro;

@Repository
public interface LibroInterface extends CrudRepository<Libro, Integer> {
	
	

}
