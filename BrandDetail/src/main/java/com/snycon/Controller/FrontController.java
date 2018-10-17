package com.snycon.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.snycon.Beans.Brand;

@Controller
public class FrontController {
	@RequestMapping("/Register")
	public ModelAndView detail(@ModelAttribute Brand brand) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("brand",brand);
		System.out.println("Sucess");
		mv.setViewName("Sucess");
		
		return mv;
	}

}
