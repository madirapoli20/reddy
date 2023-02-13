package com.slokam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main3 {
	
		
		public static void main(String[] args) {
			ApplicationContext context=new AnnotationConfigApplicationContext(springConfig.class);
			
			newDAO4 dao4 = context.getBean(newDAO4.class);
			String str = dao4.getNameByID(1);
			System.out.println(str);
			System.out.println(dao4.getCount());
			System.out.println(dao4.getPersonByID(1));
	}

}
