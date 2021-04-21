package com.vaibhav.registration_login.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.registration_login.exception.BadRequestException;
import com.vaibhav.registration_login.model.User;
import com.vaibhav.registration_login.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	
//	private PasswordEncoder encoder;
	
	
	@Override
	public User registration(User user) {
		String password = user.getPassword();
		if (password.isEmpty()) {
			throw new BadRequestException("Invalid password.");
		//	return Status.USER_ALREADY_EXISTS;
		}
		
		User userExists = userRepository.findByUsername(user.getUsername());

		if (userExists != null) {
			throw new BadRequestException(user.getUsername() + " already registered.");
		}
		
		userRepository.save(user);
		return user;
	}

	@Override
	public List<User> getAllUsers() {		
		return userRepository.findAll();
	}

	@Override
	public User loginUser(User user) {
		User userExists = userRepository.findByUsername(user.getUsername());

		if (userExists == null) {
		//	throw new BadRequestException("Invalid user name.");
			throw new RuntimeException("nvalid user name");
		}

		String password = user.getPassword();
		String uname=user.getUsername();		
		String Exituname=userExists.getUsername();
		String Exitpassword=userExists.getPassword();
		
//		if (!encoder.matches(password, userExists.getPassword())) {
//			throw new BadRequestException("Invalid user name and password combination.");
//		}
		
//		if((!uname.equals(Exituname))&&(!password.equals(Exitpassword))) {
//			throw new BadRequestException("Invalid user name and password combination.");
//			
//		}
		if(!uname.equals(Exituname)) {
			throw new BadRequestException("Invalid user name and password combination.");
		//	throw new RuntimeException("Invalid user name and password combination.");
			
		} else if(!password.equals(Exitpassword)) {
			throw new BadRequestException("Invalid user name and password combination.");

		//	throw new RuntimeException("Invalid user name and password combination.");
			
			
		}
		
		return userExists;
		
		
	}

}
