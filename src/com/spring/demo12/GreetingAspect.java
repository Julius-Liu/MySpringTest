package com.spring.demo12;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {
	@Around("execution(* com.spring.demo12.GreetingImpl.*(..)) && args(name)")
    public Object around(ProceedingJoinPoint pjp, String name) throws Throwable {
        before();
        Object result = pjp.proceed();
        System.out.println("args, name:" + name);
        after();
        return result;
    }

    private void before() {
        System.out.println("This is demo12 Before");
    }

    private void after() {
        System.out.println("This is demo12 After");
    }
}
