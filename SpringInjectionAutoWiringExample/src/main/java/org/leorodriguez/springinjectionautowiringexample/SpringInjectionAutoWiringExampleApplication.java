package org.leorodriguez.springinjectionautowiringexample;

import org.leorodriguez.springinjectionautowiringexample.myServices.Coach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringInjectionAutoWiringExampleApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringInjectionAutoWiringExampleApplication.class, args);
		//Get the bean from the spring container
		Coach coach = context.getBean(Coach.class);
		//Call a method on the bean
		System.out.println(coach.getDailyWorkout());
		//Call the method to get daily fortune
		System.out.println(coach.getDailyFortune());
		//Close the context
		context.close();
	}
}

