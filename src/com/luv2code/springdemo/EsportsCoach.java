package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class EsportsCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Practice minion farming in League of Legends";
	}
	
	public String getFavoriteGame() {
		return "League of Leagends";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
