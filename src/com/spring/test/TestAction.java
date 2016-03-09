package com.spring.test;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAction {
	
	public static void main(String[] args) {  
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");  
		Action bean = (Action) ctx.getBean("theAction");  
		System.out.println(bean.execute("Rod"));  
	} 
}
