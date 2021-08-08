package com.example.springmvc.dao;

import java.util.List;

import com.example.springmvc.model.Companylogin;
import com.example.springmvc.model.Companyregistration;
import com.example.springmvc.model.User;

public interface CompanyDao {

	 List<Companyregistration> empList(); 

	void register(Companyregistration user);

	User validateUser(Companylogin login);

	
	
}
