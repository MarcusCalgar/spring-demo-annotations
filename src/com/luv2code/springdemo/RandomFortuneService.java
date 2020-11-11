package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] fortunes = {
			"Beware of the wolf in sheep's clothing",
			"Diligence if the mother of good luck",
			"The journey is the reward"			
	};
	
	//create a random number generator
	private Random numberGenerator = new Random();
	
	@Override
	public String getFortune() {
		// pick a random fortune from the array
		int index = numberGenerator.nextInt(fortunes.length);
		
		return fortunes[index];
	}

}
