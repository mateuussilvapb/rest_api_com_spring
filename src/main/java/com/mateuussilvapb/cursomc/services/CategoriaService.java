package com.mateuussilvapb.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateuussilvapb.cursomc.domain.Categoria;
import com.mateuussilvapb.cursomc.repositories.CategoriaRepository;
import com.mateuussilvapb.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	/*
	 * Quando se declara uma dependência e é acrescentado a anotação 'Autowired', a
	 * dependência é instânciada automaticamente pelo Spring.
	 */
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ". "
						+ "Tipo: " + Categoria.class.getName()));
	}

}
