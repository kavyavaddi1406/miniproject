package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Driver;
@Repository
public interface DriverDAO  extends JpaRepository<Driver, Integer>{

}
