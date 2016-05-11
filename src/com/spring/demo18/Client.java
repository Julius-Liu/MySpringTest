package com.spring.demo18;

import org.springframework.aop.framework.ProxyFactory;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
        //factory.addInterface(Pojo.class);
		//factory.setTarget(new SimplePojo());
        proxyFactory.addAdvice(new AroundAdvice());

        Pojo pojo = (Pojo) proxyFactory.getProxy();

        // this is a method call on the proxy!
        pojo.foo();
	}
}
