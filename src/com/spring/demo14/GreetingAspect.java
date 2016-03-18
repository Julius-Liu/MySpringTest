package com.spring.demo14;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAspect {
	@DeclareParents(value = "com.spring.demo14.GreetingImpl", defaultImpl = ApologyImpl.class)
    private Apology apology;

	public Apology getApology() {
		return apology;
	}

	public void setApology(Apology apology) {
		this.apology = apology;
	}
}
