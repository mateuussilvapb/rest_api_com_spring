package com.mateuussilvapb.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateuussilvapb.cursomc.domain.Cliente;
import com.mateuussilvapb.cursomc.repositories.ClienteRepository;
import com.mateuussilvapb.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	/*
	 * Quando se declara uma dependência e é acrescentado a anotação 'Autowired', a
	 * dependência é instânciada automaticamente pelo Spring.
	 */
	@Autowired
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ". "
						+ "Tipo: " + Cliente.class.getName()));
	}

}
