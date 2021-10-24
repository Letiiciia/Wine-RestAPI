package com.winestore.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZipCodeDto {
	private Long id;
	private String codigoLoja;
	private String faixaInicio;
	private String faixaFim;
}
