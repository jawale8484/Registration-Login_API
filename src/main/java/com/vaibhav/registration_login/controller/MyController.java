package com.vaibhav.registration_login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.registration_login.model.User;
import com.vaibhav.registration_login.service.UserService;

@RestController
@RequestMapping("/")
public class MyController {
	
	@Autowired
	UserService userservice;
	
	
	@GetMapping
	public String welcome() {
		return "Welcome-Vaibhav";
	}
	
	@PostMapping("/user/registration")
	public User registration(@RequestBody User user) {
		return this.userservice.registration(user);
	}
	
	@GetMapping("/users")
	public List<User> getUser(){
		return userservice.getAllUsers();
	}
	
	@PostMapping("/user/login")
	public User login(@Validated @RequestBody User user) {
		return userservice.loginUser(user);
	}
}
