package com.spring.mvc.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.annotation.bean.Person;

@Controller
public class PersonController {

	@RequestMapping("/register")
	public ModelAndView registerPerson(@ModelAttribute Person person) {	
			
			ModelAndView mv = new ModelAndView();

		
		
		mv.addObject("person", person);

		mv.setViewName("success");

		return mv;

	}

}
