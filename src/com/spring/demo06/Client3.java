package com.spring.demo06;

import com.spring.api.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 6. Spring AOP：环绕增强（声明式）【第3版】
 */
public class Client3 {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxyClient3");
        greeting.sayHello("Jack");
    }
}
