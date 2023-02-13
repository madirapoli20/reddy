package com.slokam;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.slokam.service;

    @Configuration
    @ComponentScan("com.slokam")
    public class springConfig {
	
	@Bean
	public DAO dao() {
		return new DAO();
	}
	@Bean
	public service service() {
		
		
		return  new service();
	}
	@Bean
	 public Controller controller() {
		 return new Controller();
	 }
	
	@Bean DataSource dataSource() 
	{
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/novhib");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return ds;
				
	}
	
	@Bean
	public JdbcTemplate jdbcTemplates() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(dataSource());
		return jt;
	}
	

}
