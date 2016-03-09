package com.spring.demo7;

import com.spring.api.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingImplThrows implements Greeting {

	@Override
	public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
        throw new RuntimeException("Error");
	}

}
