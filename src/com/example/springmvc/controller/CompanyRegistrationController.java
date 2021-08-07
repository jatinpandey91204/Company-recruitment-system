package com.example.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.springmvc.model.Companyregistration;
import com.example.springmvc.service.CompanyService;
@Controller
public class CompanyRegistrationController {
	@Autowired
	public CompanyService companyService;

	@RequestMapping(value = "/Companyreg", method = RequestMethod.GET)

	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("Companyreg");
		mav.addObject("user", new Companyregistration());
		return mav;
	}

	
	  @RequestMapping(value = "/register", method = RequestMethod.POST) 
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse
	  response,
	  
	  @ModelAttribute("user") Companyregistration user) {
	  
	  companyService.register(user);
	  
	  return new ModelAndView("welcome"); }
	 
	 
	 
	 
	/*
	 @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET) public
	 String delete(@PathVariable int id){ userService.delete(id); return
	  "redirect:/admin"; }*/
	
}
