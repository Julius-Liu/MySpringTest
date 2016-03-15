package com.spring.demo05;

import org.aopalliance.aop.Advice;
import org.springframework.aop.framework.ProxyFactory;

import com.spring.api.Greeting;

public class Client4 {
	public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingAfterAdvice());

        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("Jack");
    }
}
