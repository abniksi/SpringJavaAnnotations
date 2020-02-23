package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		BaseballCoach theCoach = context.getBean("newBaseballCoachID", BaseballCoach.class);
		EsportsCoach eCoach = context.getBean("esportsCoach", EsportsCoach.class); 
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.randomHelloWorld());
		System.out.println(eCoach.getDailyWorkout());
		System.out.println(eCoach.getFavoriteGame());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
