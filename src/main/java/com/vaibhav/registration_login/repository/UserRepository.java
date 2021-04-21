package com.vaibhav.registration_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaibhav.registration_login.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
