package com.spring.demo08;

import com.spring.api.Greeting;
import org.springframework.stereotype.Component;

@Component
public class GreetingImplSorry implements Greeting {
	
	@Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
