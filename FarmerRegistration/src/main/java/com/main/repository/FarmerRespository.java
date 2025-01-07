package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Farmer;

public interface FarmerRespository extends JpaRepository<Farmer, Long>{

}
