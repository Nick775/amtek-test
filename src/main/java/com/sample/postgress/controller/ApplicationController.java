package com.sample.postgress.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.postgress.entity.Parking;
import com.sample.postgress.service.ParkingService;

@RestController
@RequestMapping("/postgressApp")
public class ApplicationController {

	@Resource
	ParkingService parkingService;

	@PutMapping(value = "/executeParkingEmp")
	public void executeParking(@RequestBody Parking emp) {
		 parkingService.executeParking(emp);
	}

}
