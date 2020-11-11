package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the beans from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call methods on the beans
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		System.out.println(theCoach.getDailyWOrkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
