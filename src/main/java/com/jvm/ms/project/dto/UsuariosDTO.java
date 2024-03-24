/**
 * @file: ReclamosDTO.java
 * @author: (c)2024 Vega 
 * @created: Mar 23, 2024 12:17:47 AM
 */
package com.jvm.ms.project.dto;

import java.util.List;

import com.jvm.ms.project.domain.Usuarios;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UsuariosDTO {
	private Long idUser;
	@NotBlank(message = "El Usuario no puede estar en blanco")
	@Size(min = 2, message = "El usuario debe tener al menos 4 caracteres")
	private String user;
	@NotBlank(message = "El password no puede estar en blanco")
	@Size(min = 8, message = "El password debe tener al menos 8 caracteres")
	private String password;
	@NotNull (message = "El rol no puede tener un valor Nulo")
	@Pattern(regexp = "^(ADMINISTRADOR|CLIENTE|REPARTIDOR|CONTADOR|GERENTE)$", message = "Los roles permitidos son: ADMINISTRADOR|CLIENTE|REPARTIDOR|CONTADOR|GERENTE ")
	@Pattern(regexp = "^[A-Z]*$", message = "Los estados deben estar en mayuscula")
	private String rol;
	private List<Usuarios> usuarios;
}
