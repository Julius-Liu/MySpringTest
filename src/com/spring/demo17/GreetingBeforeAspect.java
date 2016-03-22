package com.spring.demo17;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingBeforeAspect {
	//@Before("execution(* com.spring.model.Employee.get*())")
	/*
	public void employeeBeforeAdvice() {
		System.out.println(this.getClass().toString() + " - employeeBeforeAdvice()");
	}
	*/
	
	@Before("execution(* com.spring.model.Employee.get*())")
	public Object employeeBeforeAdviceShortcut() {
		System.out.println(this.getClass().toString() + " - - Shortcut JoinPoint method");
		return null;
	}
}
