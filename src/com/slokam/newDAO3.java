package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class newDAO3{
	
	//shortcut  process using JDBC template
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	void insertPerson(int age ,String name,String qual)
	{
		jdbcTemplate.update("insert into person(page,pname,pqual) values(?,?,?)" ,age,name,qual);
	}

}
