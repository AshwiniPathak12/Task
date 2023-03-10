package com.ems.repository;

import com.ems.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>{

	
	User findByUsername(String username);
}
