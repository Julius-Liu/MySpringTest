package com.spring.demo09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 9. Spring AOP：切面
 */
public class Client {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/springDemo09.xml");
        GreetingImplAdvisor greetingImplAdvisor = (GreetingImplAdvisor) context.getBean("greetingProxyAdvisor");

        greetingImplAdvisor.sayHello("Jack without advice");
        System.out.println();
        greetingImplAdvisor.goodMorning("Julius with advice");
        System.out.println();
        greetingImplAdvisor.goodNight("Jenny with advice");
        System.out.println();
    }
}
