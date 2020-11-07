package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the beans from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call method on the beans
		System.out.println(theCoach.getDailyWOrkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
