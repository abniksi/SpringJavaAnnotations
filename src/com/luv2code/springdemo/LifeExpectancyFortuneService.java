package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LifeExpectancyFortuneService implements FortuneService{
	
	@Value("${foo.fortune1}")
	private String fortune1;
	@Value("${foo.fortune2}")
	private String fortune2;
	@Value("${foo.fortune3}")
	private String fortune3;
	@Value("${foo.fortune4}")
	private String fortune4;
	@Value("${foo.fortune5}")
	private String fortune5;
	
	@Override
	public String getDailyFortune() {
		return lifeExpectancy();
	}
	
	private String lifeExpectancy() {
		
		ArrayList<String> life = new ArrayList<String>();
		life.add(fortune1);
		life.add(fortune2);
		life.add(fortune3);
		life.add(fortune4);
		life.add(fortune5);
		
		Random random = new Random();
		int x = random.nextInt(life.size());
		
		return life.get(x);
	}

}
