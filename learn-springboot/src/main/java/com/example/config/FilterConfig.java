package com.example.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.filter.MyFilter;

/**
 * 注册自定义的过滤器
 * @author chenws
 *
 */
@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean registrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}

}
