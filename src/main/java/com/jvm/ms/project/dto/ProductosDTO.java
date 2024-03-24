/**
 * @file: ProductosDTO.java
 * @author: (c)2024 Vega 
 * @created: Mar 23, 2024 12:17:47 AM
 */
package com.jvm.ms.project.dto;

import java.util.List;

import com.jvm.ms.project.domain.Productos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductosDTO {
	private Long idProducto;
	@NotBlank(message = "La Descripcion del producto no puede estar en blanco")
	@Size(min = 2, message = "La Descripcion del producto debe tener al menos 3 caracteres")
	private String descripcion;
	@Positive
	private float precio;
	@NotBlank(message = "El producto no puede estar en blanco")
	@Size(min = 2, message = "El producto debe tener al menos 3 caracteres")
	private String producto;
	@Positive
	private Long stockDisponible;
	private List<Productos> productos;
}
