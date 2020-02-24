package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("newBaseballCoachID")
@Scope("singleton")
public class BaseballCoach implements Coach{
	
	//Field injection
	@Autowired
	@Qualifier("lifeExpectancyFortuneService")
	private FortuneService fortuneService;
	
	@PostConstruct
	public void whatDoILove() {
		System.out.println("Tyler the Creator");
	}
	
	@PreDestroy
	public void goodSong() {
		System.out.println("Glitter");
	}
	
	//Constructor injection
//	public BaseballCoach(HappyFortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	//Setter injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Throw 90 MPH";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	public String randomHelloWorld() {
		return "Hello World";
	}
}
