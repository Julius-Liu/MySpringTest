package com.spring.demo13;

import com.spring.api.Greeting;
import com.spring.api.GreetingAd;
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
        System.out.println();
        
        GreetingAd greetingAd = (GreetingAd) context.getBean("greetingAdImpl");
        greetingAd.sayHello("Julius");
        System.out.println();
        greetingAd.saySorry("Julius");
        System.out.println();
        greetingAd.sayGoodbye("Julius");
        System.out.println();
        greetingAd.sayHell("Julius");
        System.out.println();
        greetingAd.sayGoAway("Julius");
        System.out.println();
    }
}
