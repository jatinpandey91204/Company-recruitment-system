package com.example.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springmvc.dao.CompanyDao;
import com.example.springmvc.model.Companylogin;
import com.example.springmvc.model.Companyregistration;
import com.example.springmvc.model.User;
@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyDao companyDao;

	@Override
	public void register(Companyregistration user) {
		// TODO Auto-generated method stub
		companyDao.register(user);
		
	}

	@Override
	public User validateUser(Companylogin login) {
		// TODO Auto-generated method stub
		return companyDao.validateUser(login);
	}

	
	 @Override public List<User> empList() { // TODO Auto-generated method stub
	  return companyDao.empList(); }
	 

	/*
	 * @Override public void delete(int id) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	/*
	 * @Override public void delete(int id) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
