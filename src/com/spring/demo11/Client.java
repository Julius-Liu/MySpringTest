package com.spring.demo11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 11. Spring AOP：自动代理（扫描切面配置）
 */
public class Client {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/springDemo11.xml");
        GreetingImplAutoProxy greetingImplAutoProxy = (GreetingImplAutoProxy) context.getBean("greetingImplAutoProxy");

        greetingImplAutoProxy.sayHello("Jack");
        greetingImplAutoProxy.goodMorning("Jack");
        greetingImplAutoProxy.goodNight("Jack");
    }
}
