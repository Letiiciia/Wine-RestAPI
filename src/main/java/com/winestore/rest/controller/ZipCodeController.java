package com.winestore.rest.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.winestore.rest.dto.ZipCodeDto;
import com.winestore.rest.model.ZipCode;
import com.winestore.rest.service.ZipCodeService;

@RestController
@RequestMapping("/zipCode")
public class ZipCodeController {
	
	@Autowired
	private ZipCodeService zipCodeService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@PostMapping
	public ResponseEntity<ZipCodeDto> postZipCode(@RequestBody ZipCodeDto zipCodeDto) {
		ZipCode zipCode = zipCodeService.register(modelMapper.map(zipCodeDto, ZipCode.class));
		return ResponseEntity.status(HttpStatus.CREATED).body(modelMapper.map(zipCode, ZipCodeDto.class));
	}

}
