package com.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.AdminUserDaoImp;
import com.dto.AdminUser;

@Controller
@RequestMapping(value="/admin")
public class AdminLogin {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView adminLogin() {
		ModelAndView modelAndView= new ModelAndView("adminLogin");
		return(modelAndView);
	}
	
	@RequestMapping(value="/validate", method=RequestMethod.GET)
	public ModelAndView validateUser(@RequestParam("username") String username,@RequestParam("password") String password) {
		ModelAndView modelAndView = null;
		
		AdminUser adminUser = new AdminUser("Admin","Admin123");
		AdminUserDaoImp adimUserDao = new AdminUserDaoImp(); 
		adimUserDao.addAdminUser(adminUser);
		
		
		if(username.equals("Admin") && password.equals("Admin123"))
			modelAndView =new ModelAndView("redirect:/admin/dashboard");
		else
			modelAndView =new ModelAndView("adminLogin");
		return modelAndView;
	}
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public ModelAndView dashboard() {
		ModelAndView modelAndView = new ModelAndView("adminDashboard");
		return modelAndView;
	}

}
