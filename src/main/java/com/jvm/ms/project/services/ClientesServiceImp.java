package com.jvm.ms.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvm.ms.project.domain.Clientes;
import com.jvm.ms.project.repositories.ClientesRepository;

@Service
public class ClientesServiceImp implements ClientesService {
	
	@Autowired
	private ClientesRepository cliSi;

	@Override
	@Transactional
	public List<Clientes> listarTodos() {
		return cliSi.findAll();
	}

	@Override
	@Transactional
	public Clientes buscarPorId(Long id) {
		Optional<Clientes> usuario = cliSi.findById(id);
		return usuario.get();
	}

	@Override
	@Transactional
	public Clientes grabar(Clientes cliente) {
		return cliSi.save(cliente);
	}

	@Override
	@Transactional
	public Clientes actualizar(Clientes cliente, Long id) {
		cliente.setIdCliente(id);
		return cliSi.save(cliente);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		cliSi.deleteById(id);
	}

	@Override
	@Transactional
	public Clientes findById(Long idCliente) {
		return cliSi.findById(idCliente).get();
	}

	@Override
	@Transactional
	public Clientes findByDni(String dni) {
		return cliSi.findByDni(dni).get();
	}

	@Override
	@Transactional
	public Clientes findByNombres(String nombres) {
		return cliSi.findByNombres(nombres).get();
	}

}
