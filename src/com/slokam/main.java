package com.slokam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(springConfig.class);
		
		Controller controller = context.getBean(Controller.class);
		
		controller.logic();
	}

}
