package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;

public class service {
	@Autowired
	private DAO dao;
	

	public void logic() {
		
		System.out.println("service logic start");
		dao.logic();
		System.out.println("service logic end");
	}

}
