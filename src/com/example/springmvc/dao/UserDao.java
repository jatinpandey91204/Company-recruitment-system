package com.example.springmvc.dao;
import java.util.List;

import com.example.springmvc.model.StudentLogin;
import com.example.springmvc.model.User;

public interface UserDao {

	void register(User user);
	User validateUser(StudentLogin login);
	List<User> empList();
	
	 void delete(int id);
	
}
