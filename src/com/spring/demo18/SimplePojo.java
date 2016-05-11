package com.spring.demo18;

public class SimplePojo implements Pojo {
	
	public void foo() {
        // this next method invocation is a direct call on the 'this' reference
        this.bar();
    }

    public void bar() {
        System.out.println("This is bar method.");
    }
}
