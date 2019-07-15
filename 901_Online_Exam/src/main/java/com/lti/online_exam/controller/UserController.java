package com.lti.online_exam.controller;

import java.util.List;

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
import com.lti.online_exam.model.User;
import com.lti.online_exam.service.IUserService;


@Controller
@RequestMapping(value="/user")
public class UserController {
	//prep work 2 - autowire service
		@Autowired
		private IUserService userService;
		//http://localhost:8082/701_SpringMVC/user/userList
		@RequestMapping(value="/userList")
		public String showUserList(Model model) throws ExamException {
			//prep work 3- call service method and add it to model attribute and return viewName
			//List<User> userList = userService.getUserList();
			//controller will process the req with the help of service method
			//return model and view
			//model.addAttribute("userList", userList);
			return "userListPage";//view name which will be returned to dispacherServlet
		}
		@RequestMapping(value="/addUserForm")
		public ModelAndView showAddUserForm() {
			ModelAndView mv = new ModelAndView();
			//User user = new User(101, "Zara", "Khan", "zara@lti.com");
			//return model and view
			mv.addObject("title", "Add New Login Page");
			//mv.addObject("user", user);
			mv.setViewName( "addUserPage");/* create addUserPage.jsp WEB-INF/views*/
			return mv;//view name which will be returned to dispacherServlet
		}
		@RequestMapping(value="/addUser",method=RequestMethod.POST)
		public String addUser(
				@ModelAttribute(value="user") @Validated User user,
				BindingResult bindingResult, Model model) throws ExamException {
			String viewName="redirect:userList";
			if(bindingResult.hasErrors()) {//validations
				model.addAttribute("msg", "Adding User Failed!");
				model.addAttribute("user", new User());
				viewName="redirect:addUserForm";
				//prefix redirect is used to redirect from one controller method to the another method
			}
			userService.addUser(user);
			model.addAttribute("user",user);
			return viewName; 
		}

}
