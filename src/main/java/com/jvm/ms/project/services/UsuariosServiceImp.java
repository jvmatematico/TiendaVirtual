package com.jvm.ms.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvm.ms.project.domain.Usuarios;
import com.jvm.ms.project.repositories.UsuariosRepository;

@Service
public class UsuariosServiceImp implements UsuariosService {

	@Autowired
	private UsuariosRepository usuariosSi;
	
	@Override
	@Transactional
	public List<Usuarios> listarTodos() {
		return usuariosSi.findAll();
	}

	@Override
	@Transactional
	public Usuarios buscarPorId(Long id) {
		Optional<Usuarios> usuario = usuariosSi.findById(id);
		return usuario.get();
	}

	@Override
	@Transactional
	public Usuarios grabar(Usuarios usuario) {
		return usuariosSi.save(usuario);
	}

	@Override
	@Transactional
	public Usuarios actualizar(Usuarios usuario, Long id) {
		usuario.setIdUser(id);
		return usuariosSi.save(usuario);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		usuariosSi.deleteById(id);
	}

	@Override
	@Transactional
	public Usuarios finByUser(String user) {
		return usuariosSi.findByUser(user).get();
	}

}
