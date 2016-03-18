package com.spring.demo05;

import org.aspectj.lang.JoinPoint;
import org.aopalliance.aop.Advice;

public class GreetingAfterAdvice implements Advice{
	
	public void after(JoinPoint jp) throws Throwable {
        System.out.println("ProxyFactory Driven: After executing " + 
        		jp.getSignature().getName()+ "()");
    }
}
