package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	/*
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	/* - Method Injection
	@Autowired
	public void reallySetFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside reallySetFortuneService() method");
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWOrkout() {		
		return "Practice your backhand volley.";		
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
