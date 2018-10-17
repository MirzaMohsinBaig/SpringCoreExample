package com.snycon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.snycon.beans.Brand;

@Controller
public class MyController {
	
	
	    @RequestMapping("/register")
		public ModelAndView registerperson(@ModelAttribute Brand brand)
	
	{
			ModelAndView mv=new ModelAndView();
			mv.addObject("brand",brand);
			mv.setViewName("success");
			
			return mv;
			
		}

}
