package com.winestore.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winestore.rest.model.ZipCode;
import com.winestore.rest.repository.ZipCodeRepository;


@Service
public class ZipCodeService {
	
	@Autowired
	private ZipCodeRepository zipCodeRepository;
	
	public ZipCode register(ZipCode zipCode) {
		return zipCodeRepository.save(zipCode);
	}

}
