package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.interceptor.MyInterceptor;
import com.example.interceptor.ReturnInterceptor;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
		// 下面拦截器 拦截返回内容（特殊处理再返回）
	  //	registry.addInterceptor(new ReturnInterceptor()).addPathPatterns("/**");
		
	}
	
}
