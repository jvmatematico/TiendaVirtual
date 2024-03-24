/**
 * @file: PagosDTO.java
 * @author: (c)2024 Vega 
 * @created: Mar 23, 2024 12:17:47 AM
 */
package com.jvm.ms.project.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.jvm.ms.project.domain.Clientes;
import com.jvm.ms.project.domain.Pagos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PagosDTO {
	private Long idPago;
	@NotNull(message = "La fecha de pago de investigación no puede estar vacía")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaPago;
	private Clientes cliente;
	@NotNull (message = "El Metodo de Pago no puede tener un valor Nulo")
	@Pattern(regexp = "^(CONTADO|CREDITO|TARJETA|PROMOCION)$", message = "Los metodos de pagos permitidos son: CONTADO|CREDITO|TARJETA|PROMOCION ")
	@Pattern(regexp = "^[A-Z]*$", message = "Los estados deben estar en mayuscula")
	private String metodoPago;
	@Positive
	private float montoPago;	
    private List<Pagos> pagos;
}
