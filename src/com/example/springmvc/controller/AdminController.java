package com.example.springmvc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/*import org.websparrow.dao.EmployeeDao;
import org.websparrow.model.Employee;*/

import com.example.springmvc.dao.CompanyDao;
import com.example.springmvc.dao.UserDao;
import com.example.springmvc.model.User;

@Controller
public class AdminController {

	@Autowired
	private UserDao empDao;
	private CompanyDao companyDao;
	
	@RequestMapping(value = "/admin" , method = RequestMethod.GET)
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		System.out.println("inside admin method");
		List<User> listEmp = empDao.empList();
		model.addObject("listEmp", listEmp);
		model.setViewName("admin");
		System.out.println("outside admin method");
		return model;
	}
	
	
	  @RequestMapping(value = "/company" , method = RequestMethod.GET) 
	  public ModelAndView listEmploye(ModelAndView model) throws IOException {
	 
	 
	  List<User> listEm = companyDao.empList(); 
	  model.addObject("listEm",
	 listEm);
	  
	  model.setViewName("company");
	  
	 return model; }
	 
}
