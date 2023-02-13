package com.slokam;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
	@Autowired
	private service service;
	
	
	public void logic() {
		System.out.println("controller logic start");
		service.logic();
		System.out.println("controler logic start");
	}

}
