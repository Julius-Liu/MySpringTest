package com.spring.demo09;

import com.spring.api.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingImplAdvisor implements Greeting{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");			
	}

	public void goodMorning(String name) {
        System.out.println("Good Morning, " + name + "!");        
    }

    public void goodNight(String name) {
        System.out.println("Good Night, " + name + "!");        
    }
}
