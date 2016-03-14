package com.spring.demo12;

import com.spring.api.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 12. Spring + AspectJ（基于注解：通过 AspectJ execution 表达式拦截方法）
 */
public class Client {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/springDemo12.xml");
        Greeting greeting = (Greeting) context.getBean("greetingImpl");
        greeting.sayHello("Jack");
    }
}
