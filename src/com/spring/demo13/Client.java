package com.spring.demo13;

import com.spring.api.Greeting;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 13. Spring + AspectJ（基于注解：通过 AspectJ @annotation 表达式拦截方法）
 */
public class Client {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resource/springDemo13.xml");
        Greeting greeting = (Greeting) context.getBean("greetingImpl");

        greeting.sayHello("Jack");
    }
}
