package com.spring.demo13;

import com.spring.api.GreetingAd;
import org.springframework.stereotype.Component;

@Component
public class GreetingAdImpl implements GreetingAd {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}

	@Tag
	@Override
	public void saySorry(String name) {
		System.out.println("Sorry, " + name + "!");
	}

	@Tag01
	@Override
	public void sayGoodbye(String name) {
		System.out.println("Goodbye, " + name + "!");
	}

	@Tag
	@Override
	public void sayHell(String name) {
		System.out.println("Go to hell, " + name + "!");
	}

	@Override
	public void sayGoAway(String name) {
		System.out.println("Go away, " + name + "!");
	}

}
