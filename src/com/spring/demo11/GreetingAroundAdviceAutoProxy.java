package com.spring.demo11;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class GreetingAroundAdviceAutoProxy implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		before();
        Object result = invocation.proceed();
        after();
        System.out.println();
        return result;
    }

    private void before() {
        System.out.println("This is GreetingAroundAdviceAutoProxy Before");
    }

    private void after() {
        System.out.println("This is GreetingAroundAdviceAutoProxy After");
    }

}
