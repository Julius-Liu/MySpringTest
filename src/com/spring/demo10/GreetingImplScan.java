package com.spring.demo10;

import com.spring.api.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingImplScan implements Greeting{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello! " + name);		
	}

}
