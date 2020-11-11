package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	@PostConstruct
	public void startupInit() {
		System.out.println("TennisCoach: Inside startupInit() method.");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("TennisCoach: Inside preDestroy() method.");
	}

	/*
	 * - Constructor Injection public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */

	/*
	 * - Method Injection
	 * 
	 * @Autowired public void reallySetFortuneService(FortuneService fortuneService)
	 * {
	 * System.out.println(">> TennisCoach: inside reallySetFortuneService() method"
	 * ); this.fortuneService = fortuneService; }
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
