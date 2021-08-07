package com.example.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.UserDao;
import com.example.springmvc.model.StudentLogin;
import com.example.springmvc.model.User;
@Service
public class UserServiceImpl implements UserService {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void register(User user) {
		userDao.register(user);
	}
	@Override
	public User validateUser(StudentLogin login) {
		return userDao.validateUser(login);
	}
	@Override
	public List<User> empList() {
		// TODO Auto-generated method stub
		return userDao.empList();
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		System.out.print("delete ");
		 userDao.delete(id);
		 System.out.print("sevice delete ");
	}


		
	}

