package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class newDAO4 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String getNameByID(int id) {
		String str = "";
		str=jdbcTemplate.queryForObject("select pname from person where pid=?",String.class,id);
		 return str;
	}

	public int getCount() {
		return jdbcTemplate.queryForObject("select count(*) from person", Integer.class);
		
	}
	
	public person getPersonByID(Integer id) {
		
		 return jdbcTemplate.queryForObject("select * from person where pid=?",new BeanPropertyRowMapper<person>(person.class),id);
	
	}
}
