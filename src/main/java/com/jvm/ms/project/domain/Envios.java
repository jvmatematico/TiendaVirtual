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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="idEnvio")
public class Envios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnvio;
	private Long idPedido;
	@Temporal(TemporalType.DATE)
	private Date fechaEnvio;
	private String direccionEnvio;
	private String estadoEnvio;
	
	/*// Relación con EnviosPedidos
	@OneToMany(mappedBy = "pedidos" , cascade = CascadeType.REMOVE)
    @JsonManagedReference
    private List<Pedidos> pedidos;*/
}
