package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * 读取配置文件属性
 * @author chenws
 *
 */
@Data
// 默认读取application.properties 文件内的
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
	
	private String driverClassName;
	
	private String url;
	
	private String userName;

	private String password;
}
