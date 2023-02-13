package com.slokam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewDAO {
	
	@Autowired
	private DataSource ds;
	
	public String getNameByID(Integer id) {
		String str = "";
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement("select pname from person where pid=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
            if(rs.next()) 
            {
            	str = rs.getString("pname");	
            }
            con.close();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return str;
			
	}


}
