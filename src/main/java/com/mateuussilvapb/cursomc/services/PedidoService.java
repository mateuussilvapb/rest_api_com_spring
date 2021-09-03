package com.mateuussilvapb.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mateuussilvapb.cursomc.domain.Pedido;
import com.mateuussilvapb.cursomc.repositories.PedidoRepository;
import com.mateuussilvapb.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	/*
	 * Quando se declara uma dependência e é acrescentado a anotação 'Autowired', a
	 * dependência é instanciada automaticamente pelo Spring.
	 */
	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id + ". "
						+ "Tipo: " + Pedido.class.getName()));
	}

}
