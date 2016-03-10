package com.spring.demo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 8. Spring AOP：引入增强
 */
public class Client {
	
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        GreetingImplSorry greetingImplSorry = (GreetingImplSorry) context.getBean("greetingProxySorry");
        greetingImplSorry.sayHello("Jack");

        // 将目标类强制向上转型为 Apology 接口（这是引入增强给我们带来的特性，也就是“接口动态实现”功能）
        Apology apology = (Apology) greetingImplSorry;
        apology.saySorry("Jack");
    }
}
