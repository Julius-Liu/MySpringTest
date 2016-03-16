package com.spring.demo09;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class GreetingAroundAdvice49 implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		before();
        Object result = invocation.proceed();
        after();        
        return result;
	}

	private void before() {
        System.out.println("This is GreetingAroundAdvice49 Before");
    }

    private void after() {
        System.out.println("This is GreetingAroundAdvice49 After");
    }
}
