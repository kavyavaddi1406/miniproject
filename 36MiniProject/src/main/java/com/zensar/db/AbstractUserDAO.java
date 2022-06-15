package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.bean.AbstractUser;
@Repository
public interface AbstractUserDAO extends JpaRepository<AbstractUser, String>{

}
