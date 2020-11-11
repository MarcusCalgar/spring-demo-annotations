package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${coach.email}")
	private String email;
	
	@Value("${coach.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}


	public SwimCoach(FortuneService fortuneService) {		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWOrkout() {		
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}