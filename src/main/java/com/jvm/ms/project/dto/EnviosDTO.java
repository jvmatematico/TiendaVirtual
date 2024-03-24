/**
 * @file: EnviosDTO.java
 * @author: (c)2024 Vega 
 * @created: Mar 23, 2024 12:17:47 AM
 */
package com.jvm.ms.project.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.jvm.ms.project.domain.Envios;
import com.jvm.ms.project.domain.Pedidos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EnviosDTO {
	private Long idEnvio;
	@NotBlank(message = "La Direccion no puede estar en blanco")
	@Size(min = 2, message = "La Direccion debe tener al menos 5 caracteres")
	private String direccion;
	@Pattern(regexp = "^(EN_EJECUCION|CANCELADO|ELIMINADO|TERMINADO)$", message = "Los estados de envio permitidos son: EN_EJECUCION|CANCELADO|ELIMINADO|TERMINADO ")
	@Pattern(regexp = "^[A-Z]*$", message = "Los estados deben estar en mayuscula")
	private String estadoEnvio;
	@NotNull(message = "La fecha de envio de investigación no puede estar vacía")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaRegistro;
	private Pedidos pedido;
    private List<Envios> envios;
}
