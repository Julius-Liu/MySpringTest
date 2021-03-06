package com.spring.demo05;

import com.spring.api.Greeting;
import org.springframework.aop.framework.ProxyFactory;

/**
 * 5. Spring AOP：前置增强 + 后置增强（编程式）
 */
public class Client1 {
	public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAdvice());
        proxyFactory.addAdvice(new GreetingAfterReturningAdvice());
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("Jack");        
    }
}
