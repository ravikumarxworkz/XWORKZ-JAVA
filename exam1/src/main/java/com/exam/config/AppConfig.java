package com.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class AppConfig implements WebMvcConfigurer {

//	@Bean
//	public InternalResourceViewResolver resolver() {
//		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
//		resourceViewResolver.setPrefix("WEB-INF/views");
//		resourceViewResolver.setSuffix(".jsp");
//		return resourceViewResolver;
//	}

}
