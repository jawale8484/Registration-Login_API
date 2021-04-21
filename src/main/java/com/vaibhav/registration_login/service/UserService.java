package com.vaibhav.registration_login.service;

import java.util.List;

import com.vaibhav.registration_login.model.User;

public interface UserService {

	User registration(User user);

	List<User> getAllUsers();

	User loginUser(User user);

}
