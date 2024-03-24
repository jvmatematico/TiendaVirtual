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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="idVentas")
public class Ventas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVentas;
	private Long idCliente;
	@Temporal(TemporalType.DATE)
	private Date fechaVenta;
	
	/*// Relación con VentaClientes
    @ManyToMany(mappedBy = "clientes")
    @JsonIgnore
    private List<Clientes> clientes;*/
}
