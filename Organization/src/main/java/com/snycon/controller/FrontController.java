package com.snycon.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

import com.snycon.beans.Organization;

	

	@Controller
	public class FrontController {
		@RequestMapping("/Register")
		public ModelAndView detail(@ModelAttribute Organization org) {
			
			ModelAndView mv = new ModelAndView();
			mv.addObject("org",org);
		
			mv.setViewName("Sucess");
			
			return mv;
		}

	}



