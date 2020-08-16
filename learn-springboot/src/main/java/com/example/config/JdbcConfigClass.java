package com.example.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;

/**
 *    适合读取配置文件的属性(公共调用)
 * @author chenws
 *
 */
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfigClass {
	
	@Bean
	public DataSource dataSource(JdbcProperties jdbcProperties) {
		DruidDataSource  dataSource = new DruidDataSource();
		dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
		dataSource.setUrl(jdbcProperties.getUrl());
		dataSource.setUsername(jdbcProperties.getUserName());
		dataSource.setPassword(jdbcProperties.getPassword());
		dataSource.setPassword(jdbcProperties.getPassword());
		return dataSource;	
		}

}
