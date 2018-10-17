package com.snycon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan("com.snycon.controller")
public class MVCConfig extends WebMvcConfigurerAdapter {
	
	
	@Bean
	public InternalResourceViewResolver addingBrand(){
		
		InternalResourceViewResolver iVR=new InternalResourceViewResolver();
		iVR.setPrefix("/WEB-INF/jsp/");
		iVR.setSuffix(".jsp");
		
		
		return iVR;
		
		
	}

}
