package com.spring.demo07;

import com.spring.api.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingImplThrows implements Greeting {

	@Override
	public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
        try {
        	int a = 10/0;
        } catch (Exception ex) {
        	throw new RuntimeException("This is RuntimeException sayHello throws!");
        }
	}

}
