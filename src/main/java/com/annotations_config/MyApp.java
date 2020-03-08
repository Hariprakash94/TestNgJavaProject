package com.annotations_config;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();

		ApplicationContext resource = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Meal myAnnotatedSpringMeal = resource.getBean("myMealAnnotation", Meal.class);

		System.out.println("Spring Annotation " + myAnnotatedSpringMeal.whatsInThisMeal());

		((AbstractApplicationContext) resource).close();
		

	}
}
