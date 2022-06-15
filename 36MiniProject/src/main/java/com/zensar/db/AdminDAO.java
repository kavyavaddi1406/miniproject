package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.Admin;
@Repository
public interface AdminDAO extends JpaRepository<Admin, Integer>{

}
