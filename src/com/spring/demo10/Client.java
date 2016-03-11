package com.spring.demo10;

import com.spring.api.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 10. Spring AOP：自动代理（扫描 Bean 名称）
 */
public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GreetingImplScan greeting = (GreetingImplScan) context.getBean("greetingImplScan");
        greeting.sayHello("Jack");
	}

}
