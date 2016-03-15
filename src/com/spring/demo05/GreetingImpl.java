package com.spring.demo05;

import com.spring.api.Greeting;

public class GreetingImpl implements Greeting {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}

}
