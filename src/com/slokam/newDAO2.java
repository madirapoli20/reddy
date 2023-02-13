package com.slokam;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class newDAO2 {
	

	@Autowired
	private DataSource dataSource;
	
	public void saveData(int age,String name,String qual)
	{
		try {
			Connection con =dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into person(page,pname,pqual) values(?,?,?))");
			ps.setInt(1, age);
			ps.setString(2, name);
			ps.setString(3, qual);
			
			ps.execute();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
