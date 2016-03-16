package com.spring.demo09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 9. Spring AOP：切面
 */
public class Client {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GreetingImplAdvisor greetingImplAdvisor = (GreetingImplAdvisor) context.getBean("greetingProxyAdvisor");

        greetingImplAdvisor.sayHello("Jack");
        System.out.println();
        greetingImplAdvisor.goodMorning("Jack");
        System.out.println();
        greetingImplAdvisor.goodNight("Jack");
        System.out.println();
    }
}
