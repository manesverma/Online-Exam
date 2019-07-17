package com.lti.online_exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.online_exam.exception.ExamException;
import com.lti.online_exam.model.Question;
import com.lti.online_exam.service.IQuestionService;

@Controller 
@RequestMapping(value="/question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService;
	
	@RequestMapping(value="/addSingleQues")
	public String showSingleQuesPage(@ModelAttribute(value="question") 
																				@Validated Question question,
																				BindingResult bindingResult, 
																				Model model) throws ExamException {
		String viewName="addSingleQuesPage";
		if(bindingResult.hasErrors()) {//validations
			model.addAttribute("msg", "Adding Question Failed!");
			model.addAttribute("question", new Question());
			viewName="redirect:addSingleQues";
		}
		questionService.addQuestion(question);
		model.addAttribute("question",question);
		return viewName;
	}
	
	@RequestMapping(value="/addSingleQuesFile")
	public ModelAndView showFileUploadPage() {
		ModelAndView mv = new ModelAndView();
		//return model and view
		mv.addObject("title", "Upload a Question File");
		mv.setViewName( "addSingleQuesFilePage");
		return mv;//view name which will be returned to dispacherServlet
	}
}
