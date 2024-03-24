package com.jvm.ms.project.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="idCliente")
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private String nombres;
	private String apePat;
	private String apeMat;
	@Column(unique = true)
	private String dni;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String codigoPostal;
	private String telefono;
	private String email;
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
}
