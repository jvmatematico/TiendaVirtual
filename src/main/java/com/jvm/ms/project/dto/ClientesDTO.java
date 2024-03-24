/**
 * @file: ClientesDTO.java
 * @author: (c)2024 Vega 
 * @created: Mar 23, 2024 12:17:47 AM
 */
package com.jvm.ms.project.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.jvm.ms.project.domain.Clientes;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ClientesDTO {
	private Long idCliente;
	@NotBlank(message = "El apellido paterno no puede estar en blanco")
	@Size(min = 2, message = "El apellido paterno debe tener al menos 3 caracteres")
	private String apePat;
	@NotBlank(message = "El apellido materno no puede estar en blanco")
	@Size(min = 2, message = "El apellido materno debe tener al menos 3 caracteres")
	private String apeMat;
	@NotBlank(message = "La Ciudad no puede estar en blanco")
	@Size(min = 2, message = "La Ciudad debe tener al menos 3 caracteres")
	private String ciudad;
	@NotBlank(message = "El codigo Postal no puede estar en blanco")
	@Size(min = 2, message = "El Codigo Postal debe tener el formato de tu pais")
	private String codigoPostal;
	@NotBlank(message = "La Direccion no puede estar en blanco")
	@Size(min = 2, message = "La Direccion debe tener al menos 5 caracteres")
	private String direccion;
	@NotBlank(message = "El DNI no puede estar en blanco")
	@Size(min = 8, max = 8, message = "El DNI debe tener exactamente 8 caracteres")
	@Pattern(regexp = "\\d+", message = "El DNI debe contener solo dígitos")
	private String dni;
	@NotBlank(message = "El email no puede estar en blanco")
	@Email(message = "El email no cumple con una estructura valida")
	private String email;
	@NotNull(message = "La fecha de registro de investigación no puede estar vacía")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaRegistro;
	@NotBlank(message = "El nombre no puede estar en blanco")
	@Size(min = 2, message = "El nombre debe tener al menos 3 caracteres")
	private String nombres;
	@NotBlank(message = "La Provincia no puede estar en blanco")
	@Size(min = 2, message = "La Provincia debe tener al menos 3 caracteres")
	private String provincia;
	@NotBlank(message = "El Telefono no puede estar en blanco")
	@Size(min = 9, max = 12, message = "El Telefono debe tener exactamente 9 caracteres")
	@Pattern(regexp = "\\d+", message = "El Telefono debe contener solo dígitos")
	private String telefono;
    private List<Clientes> clientes;
}
