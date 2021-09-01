package com.mateuussilvapb.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateuussilvapb.cursomc.domain.Categoria;
import com.mateuussilvapb.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	/*
	 * Quando se declara uma dependência e é acrescentado a anotação
	 * 'Autowired', a dependência é instânciada automaticamente pelo 
	 * Spring.
	 */
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
