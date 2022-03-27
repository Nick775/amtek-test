package com.sample.postgress.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sample.postgress.dao.ParkingDao;
import com.sample.postgress.entity.Parking;
@Component
public class ParkingServiceImpl implements ParkingService {
	@Resource
    ParkingDao parkingDao;

	@Override
	public void executeParking(Parking emp) {
		parkingDao.executeParking(emp);
		
	}

}
