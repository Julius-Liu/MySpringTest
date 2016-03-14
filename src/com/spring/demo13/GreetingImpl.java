package com.spring.demo13;

import com.spring.api.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingImpl implements Greeting{

	@Tag
	@Override
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");		
	}
}
