package com.slokam;


	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;


	public class main2 {

		public static void main(String[] args) {
		ApplicationContext contex=new AnnotationConfigApplicationContext(springConfig.class);
		
//		newDAO2 nd=contex.getBean(newDAO2.class);
		
	//String name =nd.getNameByID(1);
	//System.out.println(name);
		
		newDAO3 dao3 =contex.getBean(newDAO3.class);
		dao3.insertPerson(23, "XYZ", "Btech");
		}

}
