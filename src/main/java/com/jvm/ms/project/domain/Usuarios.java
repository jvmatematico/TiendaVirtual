package com.jvm.ms.project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuarios {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    
    @Column(unique = true)
    private String user;
    
    private String password;
    
    @Enumerated(EnumType.STRING)
    private Rol rol;
}
