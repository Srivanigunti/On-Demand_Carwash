package com.onDemand.carWash.userService.dao;

import java.util.List;

import com.onDemand.carWash.userService.entity.User;

public interface UserDao {

	User addNewUser(User user);
		
	List<User> getAllUsers();

	User findByEmailId(String emailId);
	
}