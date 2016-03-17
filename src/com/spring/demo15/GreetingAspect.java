package com.spring.demo15;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class GreetingAspect {
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
        before();
        Object result = pjp.proceed();
        //after();
        System.out.println("GreetingAspect:: After invoking sayHello method. Return value = " + result);
        return result;
    }

    private void before() {
        System.out.println("This is demo15 Before");
    }

    private void after() {
        System.out.println("This is demo15 After");
    }
}
