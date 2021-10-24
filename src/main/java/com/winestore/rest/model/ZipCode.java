package com.winestore.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ZipCode {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false, name = "codigo_loja")
	private String codigoLoja;
	
	@Column(unique = true, nullable = false, name = "faixa_inicio")
	private String faixaInicio;
	
	@Column(unique = true, nullable = false, name = "faixa_fim")
	private String faixaFim;
}
