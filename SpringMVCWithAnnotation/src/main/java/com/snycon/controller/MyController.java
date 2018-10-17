package com.snycon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.snycon.beans.Organization;

@Controller
public class MyController {
	
	@RequestMapping("/detail")
	public ModelAndView AddDetail(@ModelAttribute Organization org) {
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("org",org);
		mv.setViewName("sucess");
		return mv;
		
	}

}
