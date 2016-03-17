package com.spring.demo06;

import com.spring.api.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 6. Spring AOP：前置增强 + 后置增强（声明式）
 * 同时 implements Before and After
 */
public class Client2 {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/springDemo06_2.xml");
        Greeting greeting = (Greeting) context.getBean("greetingProxyClient2");
        greeting.sayHello("Jack");
    }
}
