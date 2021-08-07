package com.example.springmvc.service;

import java.util.List;

import com.example.springmvc.model.StudentLogin;
import com.example.springmvc.model.User;

public interface UserService {
	
	void register (User user);
	User validateUser(StudentLogin login);
	public List<User> empList();
	public void delete(int id);
	
	

}
