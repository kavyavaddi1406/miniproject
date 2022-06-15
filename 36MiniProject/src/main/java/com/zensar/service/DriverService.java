package com.zensar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Driver;
import com.zensar.db.DriverDAO;

@Service
public class DriverService {
	@Autowired
	DriverDAO dao;
	
	public Driver insertDriver(Driver driver) {
		return this.dao.save(driver);
		}



		public Driver updateDriver(Driver driver) {
			return this.dao.save(driver);

		}

		public Driver deleteDriver(int driverid) {
			Driver driver=new Driver();
			driver.setDriverId(driverid);
			this.dao.delete(driver);
			return driver;
		}
		
		public List<Driver> viewBestDrivers () {
			List<Driver> AllDrivers=this.dao.findAll();
			List<Driver> BestDrivers=new ArrayList();
			for(Driver driver:AllDrivers) {
				if(driver.getRating()>=4.5) {
					BestDrivers.add(driver);
				}
			}
			return BestDrivers;
		}
		
				public Driver viewDriver(int driverid) {
		return this.dao.findById(driverid).get();
				}
	

}
