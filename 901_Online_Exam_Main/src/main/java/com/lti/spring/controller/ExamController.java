package com.lti.spring.controller;
	import java.time.LocalDate;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	@Controller
	@RequestMapping(value="/")
	public class ExamController {
		
		@RequestMapping(value="/exam")
		public String showExamHomePage(Model model) {
			//return model and view
			model.addAttribute("msg", "Select any one subject");
			model.addAttribute("today",LocalDate.now());
			//model object associated with name 'msg'
			return "exam";//view name which will be returned to dispacherServlet
		}
		@RequestMapping(value="/java")
		public ModelAndView showJavaPage() {
			ModelAndView mv = new ModelAndView();
			//return model and view
			mv.addObject("title", "Java Exam Page");
			mv.setViewName( "examPage");
			return mv;//view name which will be returned to dispacherServlet
		}
		@RequestMapping(value="/sql")
		public ModelAndView showSqlPage() {
			ModelAndView mv = new ModelAndView();
			//return model and view
			mv.addObject("title", "SQL Exam Page");
			mv.setViewName( "examPage");
			return mv;//view name which will be returned to dispacherServlet
		}
		@RequestMapping(value="/python")
		public ModelAndView showPythonPage() {
			ModelAndView mv = new ModelAndView();
			//return model and view
			mv.addObject("title", "Pyhton Exam Page");
			mv.setViewName( "examPage");
			return mv;//view name which will be returned to dispacherServlet
		}
		@RequestMapping(value="/c")
		public ModelAndView showCPage() {
			ModelAndView mv = new ModelAndView();
			//return model and view
			mv.addObject("title", "C/C++ Exam Page");
			mv.setViewName( "examPage");
			return mv;//view name which will be returned to dispacherServlet
		}
		@RequestMapping(value="/php")
		public ModelAndView showPhpPage() {
			ModelAndView mv = new ModelAndView();
			//return model and view
			mv.addObject("title", "PHPExam Page");
			mv.setViewName( "examPage");
			return mv;//view name which will be returned to dispacherServlet
		}
		
		
		
	}








