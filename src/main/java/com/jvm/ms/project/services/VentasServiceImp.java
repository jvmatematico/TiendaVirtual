package com.jvm.ms.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jvm.ms.project.domain.Ventas;
import com.jvm.ms.project.repositories.VentasRepository;

@Service
public class VentasServiceImp implements VentasService {

	@Autowired
	private VentasRepository ventasSi;
	
	@Override
	@Transactional
	public List<Ventas> listarTodos() {
		return ventasSi.findAll();
	}

	@Override
	@Transactional
	public Ventas buscarPorId(Long id) {
		Optional<Ventas> venta = ventasSi.findById(id);
		return venta.get();
	}

	@Override
	@Transactional
	public Ventas grabar(Ventas venta) {
		return ventasSi.save(venta);
	}

	@Override
	@Transactional
	public Ventas actualizar(Ventas venta, Long id) {
		venta.setIdVentas(id);
		return ventasSi.save(venta);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		ventasSi.deleteById(id);
	}

}
