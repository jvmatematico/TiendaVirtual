package com.jvm.ms.project.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="idPago")
public class Pagos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPago;
	private String idCliente;
	@Temporal(TemporalType.DATE)
	private Date fechaPago;
	private Long montoPago;
	private String metodoPago;
}
