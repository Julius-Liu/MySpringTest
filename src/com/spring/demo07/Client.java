package com.spring.demo07;

import com.spring.api.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 7. Spring AOP：抛出增强
 */
public class Client {

	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxyThrows");
        greeting.sayHello("Jack");
	}

}
