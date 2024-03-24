package com.jvm.ms.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvm.ms.project.domain.Clientes;
import com.jvm.ms.project.services.ClientesService;

@RestController
@RequestMapping(value = "/api/clientes")//, headers ="X-VERSION=1.0.0")
public class ClientesController {
	@Autowired
	private ClientesService cliService;
	
	@GetMapping
	public List<Clientes> listarCliente(){
		return cliService.listarTodos();
	}
	
	@GetMapping ("/{id}")
	public Clientes listarPorId(@PathVariable Long id){
		return cliService.buscarPorId(id);
	}
	
	@PostMapping
	public Clientes crearCliente(@RequestBody Clientes cli){
		return cliService.grabar(cli);
	}
	
	@PutMapping ("/{id}")
	public Clientes editarCliente(@PathVariable Long id, @RequestBody Clientes cli){
		Clientes cliDB = cliService.buscarPorId(id);
		
		cliDB.setApeMat(cli.getApeMat());
		cliDB.setApePat(cli.getApePat());
		cliDB.setCiudad(cli.getCiudad());
		cliDB.setCodigoPostal(cli.getCodigoPostal());
		cliDB.setDireccion(cli.getDireccion());
		cliDB.setDni(cli.getDni());
		cliDB.setEmail(cli.getEmail());
		cliDB.setNombres(cli.getNombres());
		cliDB.setProvincia(cli.getProvincia());
		cliDB.setTelefono(cli.getTelefono());
		
		return cliService.grabar(cliDB);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable Long id) {
		cliService.eliminar(id);
	}
}
