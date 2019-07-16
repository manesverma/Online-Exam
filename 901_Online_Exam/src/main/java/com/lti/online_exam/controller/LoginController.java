package com.lti.online_exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Login;
import com.lti.online_exam.service.IUserService;

@Controller
@RequestMapping(value="/login")
public class LoginController {
	@Autowired
	IUserService userService;
	
	@RequestMapping(value="/showLogin",method=RequestMethod.GET)
	public ModelAndView getLoginPage() {
		Login loginObj = new Login();
		String viewName="loginPage";
		String modelName="loginObj";
		return new ModelAndView(viewName, modelName, loginObj);
	}
	
	
	@RequestMapping(value="/checkLogin",method=RequestMethod.POST)
	public String checkLogin(
			@ModelAttribute(value="loginObj") @Validated Login loginObj,
			BindingResult bindingResult, Model model) throws ExamException {
		String viewName="";
		if(bindingResult.hasErrors()) {//validations
			model.addAttribute("msg", "Login Failed!");
			model.addAttribute("loginObj", new Login());
			viewName="redirect:showLogin";
			//prefix redirect is used to redirect from one controller method to the another method
		}
		if(userService.authenticateUser(loginObj)) {
			model.addAttribute("loginObj", loginObj);
			model.addAttribute("msg", "Login Successful!");
			viewName="examFrontPage";
		}else {
			model.addAttribute("loginObj", new Login());
			model.addAttribute("msg", "Login Falied Invalid Credentials!");
			viewName="redirect:showLogin";
		}
		return viewName;		
	}
	@RequestMapping(value="/forgotPassword")
	public String forgotPasswordPage() {
		return "forgotPassword";
	}
}










