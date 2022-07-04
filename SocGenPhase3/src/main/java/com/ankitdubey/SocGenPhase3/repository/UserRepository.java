package com.ankitdubey.SocGenPhase3.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhartha.SocGenPhase3.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
	public UserEntity findByUsername(String name);
	//public UserEntity findByEmail(String email);
}
