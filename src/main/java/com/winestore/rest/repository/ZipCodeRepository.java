package com.winestore.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.winestore.rest.model.ZipCode;

@Repository
public interface ZipCodeRepository extends JpaRepository<ZipCode, Long>{
}
