package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Farmer;
import com.main.service.FarmerService;

@RestController
@RequestMapping("/v1/api/farmer")
@CrossOrigin("http://localhost:4200/")
public class FarmerController {
	
	@Autowired
	private FarmerService farmerService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveFarmer(@RequestBody Farmer farmer) {
		long id = farmerService.saveFarmer(farmer);
		return ResponseEntity.status(HttpStatus.CREATED).body("Farmer Created with Id "+id);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Farmer>> getAllFarmers() {
		return ResponseEntity.ok(farmerService.getAllFarmers());
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteFarmer(@PathVariable Long id) {
		farmerService.deleteFarmer(id);
		return ResponseEntity.ok("Farmer Deleted With Id : "+id);
	}
	

}
