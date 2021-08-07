package com.example.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springmvc.dao.UserDao;
import com.example.springmvc.dao.UserDaoImpl;
import com.example.springmvc.model.User;
import com.example.springmvc.service.UserService;

@Controller
public class StudentRegistrationController {
	@Autowired
	public UserService userService;
	@RequestMapping(value = "/Studentregister", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("Studentregister");
		mav.addObject("user", new User());

		return mav;
	}

	@RequestMapping(value = "/registerdone", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,

			@ModelAttribute("user") User user) {

		userService.register(user);

		return new ModelAndView("welcome");
	}

	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) 
	{
		System.out.print("delete ");
		userService.delete(id);
		System.out.print("delete executed");
		return "<h2>jatin</h2>";
		
	}

	/*
	 * It displays object data into form for the given id. The @PathVariable puts
	 * URL data into variable.
	 */
	  
	/*
	 * @RequestMapping(value="/Studentedit/{id}") public String edit(@PathVariable
	 * int id) { Emp emp=dao.getEmpById(id); m.addAttribute("command",emp); return
	 * "empeditform"; }
	 */
	  
		/*
		 * * It updates model object.
		 * 
		 * @RequestMapping(value="/editsave",method = RequestMethod.POST) public String
		 * editsave(@ModelAttribute("emp") Emp emp){ dao.update(emp); return
		 * "redirect:/viewemp"; }
		 */
	 

}