package com.example.springmvc.service;

import java.util.List;

import com.example.springmvc.model.Companylogin;
import com.example.springmvc.model.Companyregistration;
import com.example.springmvc.model.User;

public interface CompanyService {
	
	void register (Companyregistration user);
	User validateUser(Companylogin login);
	 public List<Companyregistration> empList(); 
	/* void delete(int id); */

}
