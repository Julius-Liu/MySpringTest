package com.spring.demo13;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {
	@Around("@annotation(com.spring.demo13.Tag)")
    public Object aroundTag(ProceedingJoinPoint pjp) throws Throwable {
        before();
        Object result = pjp.proceed();
        after();
        return result;
    }

    private void before() {
        System.out.println("This is Tag Before");
    }

    private void after() {
        System.out.println("This is Tag After");
    }
    
    @Around("@annotation(com.spring.demo13.Tag01)")
    public Object aroundTag01(ProceedingJoinPoint pjp) throws Throwable {
    	Object result = pjp.proceed();
    	System.out.println("This Around using Tag01");
    	return result;
    }
}
