package com.snycon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan("com.snycon.controller")
public class MvcConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public InternalResourceViewResolver adding(){
		
		InternalResourceViewResolver VR=new InternalResourceViewResolver();
		VR.setPrefix("/WEB-INF/jsp/");
		VR.setSuffix(".jsp");
		
		
		return VR;
		
		
	}
	
	
	

}
