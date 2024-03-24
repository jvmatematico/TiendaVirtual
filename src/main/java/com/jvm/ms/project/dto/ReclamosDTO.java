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
import com.jvm.ms.project.domain.Reclamos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ReclamosDTO {
	private Long idReclamo;
	@NotBlank(message = "La Descripcion del reclamo no puede estar en blanco")
	@Size(min = 2, message = "La Descripcion del reclamo debe tener al menos 3 caracteres")
	private String descripcion;
	@NotNull (message = "El estado no puede tener un valor Nulo")
	@Pattern(regexp = "^(CREADO|EN_ESPERA|ATENDIDO|TERMINADO)$", message = "Los estados permitidos son: CREADO|EN_ESPERA|ATENDIDO|TERMINADO ")
	@Pattern(regexp = "^[A-Z]*$", message = "Los estados deben estar en mayuscula")
	private String estadoReclamo;
	@NotNull(message = "La fecha del reclamo no puede estar vacía")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaReclamo;
	private Clientes cliente;
	private List<Reclamos> reclamos;
}
