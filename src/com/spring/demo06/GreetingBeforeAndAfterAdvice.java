package com.spring.demo06;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

/*
 * 同时 implements Before and After
 */
@Component
public class GreetingBeforeAndAfterAdvice implements MethodBeforeAdvice, AfterReturningAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("This is GreetingBeforeAndAfterAdvice Before");		
	}
	
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("This is GreetingBeforeAndAfterAdvice After");
	}
}
