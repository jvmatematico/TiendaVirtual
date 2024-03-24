/**
 * @file: PedidosDTO.java
 * @author: (c)2024 Vega 
 * @created: Mar 23, 2024 12:17:47 AM
 */
package com.jvm.ms.project.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.jvm.ms.project.domain.Clientes;
import com.jvm.ms.project.domain.Pedidos;
import com.jvm.ms.project.domain.Productos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PedidosDTO {
	private Long idPedido;
	@Positive
	private Long cantidadProductos;
	@NotNull(message = "La fecha de registro de investigación no puede estar vacía")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaRegistro;
	private Clientes cliente;
	private List<Productos> productos;	
    private List<Pedidos> pedidos;
}
