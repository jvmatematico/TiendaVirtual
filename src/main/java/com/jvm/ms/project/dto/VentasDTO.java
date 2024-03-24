/**
 * @file: ReclamosDTO.java
 * @author: (c)2024 Vega 
 * @created: Mar 23, 2024 12:17:47 AM
 */
package com.jvm.ms.project.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.jvm.ms.project.domain.Clientes;
import com.jvm.ms.project.domain.Ventas;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class VentasDTO {
	private Long idVenta;
	@NotNull(message = "La fecha de venta de investigación no puede estar vacía")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaVenta;
	private Clientes clientes;
	private List<Ventas> ventas;
}
