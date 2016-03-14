package com.spring.demo14;

import com.spring.api.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 14. Spring + AspectJ（引入增强）
 */
public class Client {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/springDemo14.xml");
        Greeting greeting = (Greeting) context.getBean("greetingImpl");
        greeting.sayHello("Jack");

        Apology apology = (Apology) greeting;
        apology.saySorry("Jack");
    }
}
