package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence if the mother of good luck",
			"The journey is the reward"			
	};
	
	@Override
	public String getFortune() {
		// pick a random fortune from the array
		return null;
	}

}