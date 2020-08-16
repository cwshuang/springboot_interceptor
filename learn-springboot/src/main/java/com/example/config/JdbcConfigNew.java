package com.example.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;
/**
 * 优雅的写法,目前流行的(但是读取公共属性，在代码中调用，还是使用JdbcConfigClass里的方法)
 * @author chenws
 *
 */
@Configuration
public class JdbcConfigNew {
	
	@Bean
	@ConfigurationProperties(prefix = "jdbc")
	public DataSource dataSource() {
		return new DruidDataSource();	
		}

}
