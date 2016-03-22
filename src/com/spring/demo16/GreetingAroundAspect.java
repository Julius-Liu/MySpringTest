package com.spring.demo16;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAroundAspect {
	@Around("execution(* com.spring.model.Employee.get*())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		
		//before();
		/*
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After invoking getEmpName() method. Return value = " + value);
		return value;
		*/
		
		// Shortcut JoinPoint method
		System.out.println(this.getClass().toString() + " - Shortcut JoinPoint method");
		return null;
		
	}
	
	private void before() {
		System.out.println("Before invoking getEmpName() method - before()");
	}
}
