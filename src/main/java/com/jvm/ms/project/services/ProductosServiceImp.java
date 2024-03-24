package com.jvm.ms.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvm.ms.project.domain.Productos;
import com.jvm.ms.project.repositories.ProductosRepository;

@Service
public class ProductosServiceImp implements ProductosService {

	@Autowired
	private ProductosRepository productosSi;
	
	@Override
	@Transactional
	public List<Productos> listarTodos() {
		return productosSi.findAll();
	}

	@Override
	@Transactional
	public Productos buscarPorId(Long id) {
		Optional<Productos> producto = productosSi.findById(id);
		return producto.get();
	}

	@Override
	@Transactional
	public Productos grabar(Productos producto) {
		return productosSi.save(producto);
	}

	@Override
	@Transactional
	public Productos actualizar(Productos producto, Long id) {
		producto.setIdProducto(id);
		return productosSi.save(producto);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		productosSi.deleteById(id);
	}

	

}
