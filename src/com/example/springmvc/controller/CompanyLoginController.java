package com.example.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.model.Companylogin;
import com.example.springmvc.model.StudentLogin;
import com.example.springmvc.model.User;
import com.example.springmvc.service.CompanyService;


@Controller
public class CompanyLoginController {
	
	  @Autowired
	 CompanyService companyService;

	  @RequestMapping(value = "/Companylog", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("Companylog");
	    mav.addObject("login", new StudentLogin());

	    return mav;
	  }

	  @RequestMapping(value = "/loginP", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	      @ModelAttribute("login") Companylogin login) {
	    ModelAndView mav = null;

	    User user = companyService.validateUser(login);

	    if (null != user) {
	      mav = new ModelAndView("welcome");
	      mav.addObject("firstname", user.getFirstname());
	    } else {
	      mav = new ModelAndView("login");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }

	    return mav;
	  }

}
