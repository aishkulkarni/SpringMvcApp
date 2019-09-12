package com.sakha.web.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.sakha.web")

public class Sakhawebconfigur {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver rv=new InternalResourceViewResolver();
		rv.setSuffix(".jsp");
		rv.setPrefix("pages/");
		return rv;
		
	}

}
