package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Cab;
@Repository
public interface CabDAO extends JpaRepository<Cab, Integer>{

}
