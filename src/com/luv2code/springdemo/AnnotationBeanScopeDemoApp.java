package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		//load config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retireve bean from spring container
		Coach theCoach = context.getBean("newBaseballCoachID", Coach.class);
		Coach theCoach2 = context.getBean("newBaseballCoachID", Coach.class);
		
		boolean result = (theCoach == theCoach2);
		
		System.out.println(result);
		System.out.println(theCoach.toString());
		System.out.println(theCoach2.toString());
		
		context.close();
	}
}
 