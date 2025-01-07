package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Farmer;
import com.main.repository.FarmerRespository;

@Service
public class FarmerService {
	
	@Autowired
	private FarmerRespository farmerRespository;
	
//	method to save the farmer details in db 
	public Long saveFarmer(Farmer farmer) {
		Farmer saveFarmer = farmerRespository.save(farmer);
		return saveFarmer.getId();
	}
	
//	method to get the data of all farmers
	public List<Farmer> getAllFarmers(){
		return farmerRespository.findAll();
	}
	
//	method to delete farmers
	public void deleteFarmer(Long id) {
		farmerRespository.deleteById(id);
	}
	
	
	

}
