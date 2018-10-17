package com.snycon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.snycon.beans.Product;

@Controller
public class FrontController {
	
	@RequestMapping("/Detail")
	public ModelAndView detail(@ModelAttribute Product pro) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("pro",pro);
		
		mv.setViewName("Sucess");
		
		return mv;
	}
	

}
