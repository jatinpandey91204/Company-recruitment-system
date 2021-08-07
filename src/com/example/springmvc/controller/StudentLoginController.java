package com.example.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.StudentLogin;
import com.example.springmvc.model.User;
import com.example.springmvc.service.UserService;

@Controller
public class StudentLoginController {

	  @Autowired
	  UserService userService;

	  @RequestMapping(value = "/Studentlogin", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("Studentlogin");
	    mav.addObject("login", new StudentLogin());

	    return mav;
	  }
	  
	
	  

		
		  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
		  public ModelAndView LoginProcess(HttpServletRequest request, HttpServletResponse
		  response,
		 
		  @ModelAttribute("login") StudentLogin login) { ModelAndView mav = null;
		  
		  User user = userService.validateUser(login);
		  
		  if (null != user) { mav = new ModelAndView("welcome");
		  mav.addObject("firstname", user.getFirstname()); } else { mav = new
		  ModelAndView("login"); mav.addObject("message",
		  "Username or Password is wrong!!"); }
		 

	    return mav;
		 } 

	}
