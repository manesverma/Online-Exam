package com.lti.online_exam.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	@RequestMapping(value="/")
	public String showHomePage(Model model) {
		//return model and view
		model.addAttribute("msg", "Welcome to Online Examination");
		model.addAttribute("today",LocalDate.now());
		//model object associated with name 'msg'
		return "home";//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/home")
	public String showHomePage1(Model model) {
		//return model and view
		model.addAttribute("msg", "Welcome to Online Examination");
		model.addAttribute("today",LocalDate.now());
		//model object associated with name 'msg'
		return "home";//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/about")
	public ModelAndView showAboutPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "Online Examination- About Page");
		mv.setViewName( "aboutPage");
		return mv;//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/login")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "Online Examination- Login Page");
		mv.setViewName( "loginPage");
		return mv;//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/report")
	public ModelAndView showReportPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "Online Examination- Login Page");
		mv.setViewName( "loginPage");
		return mv;//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/newExam")
	public ModelAndView showNewExamPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "Online Examination- Login Page");
		mv.setViewName( "loginPage");
		return mv;//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/register")
	public ModelAndView showRegisterPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "Online Examination- Registration Page");
		mv.setViewName( "addUserPage");
		return mv;//view name which will be returned to dispacherServlet
	}
}
