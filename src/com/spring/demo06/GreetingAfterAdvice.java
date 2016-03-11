package com.spring.demo06;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component
public class GreetingAfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {
		System.out.println("This is GreetingAfterAdvice After");
		
	}

}
