package com.lti.online_exam.controller;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping(value="/admin")
public class AdminController {

	@RequestMapping(value="/adminFront")
	public String showAdminPage(Model model) {
		//return model and view
		model.addAttribute("msg", "Select any one action");
		model.addAttribute("today",LocalDate.now());
		//model object associated with name 'msg'
		return "adminFrontPage";//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/addQues")
	public ModelAndView showAddQuesPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "Add Questions Page");
		mv.setViewName( "addQuesPage");
		return mv;//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/removeQues")
	public ModelAndView showRemoveQuesPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "Remove Questions Page");
		mv.setViewName( "removeQuesPage");
		return mv;//view name which will be returned to dispacherServlet
	}
	@RequestMapping(value="/viewResult")
	public ModelAndView showViewResultPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "View Result Page");
		mv.setViewName( "viewResultPage");
		return mv;//view name which will be returned to dispacherServlet
	}

	//@RequestMapping(value="/addSingleQues")
	
	
	//@RequestMapping(value="/addSingleQuesFile")

	
	
}







