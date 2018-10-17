package com.spring.mvc.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Component
@ComponentScan("com.spring.mvc.annotation.controller")
public class MVCConfig extends WebMvcConfigurerAdapter {

	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver irv= new InternalResourceViewResolver();
		irv.setPrefix("/WEB-INF/jsp/");
		irv.setSuffix(".jsp");
		
		return irv;
	}
	
	
	
	
	
	
}
