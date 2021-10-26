package com.pattern.ssm.chapter2.intercept;

import com.pattern.ssm.chapter2.proxy.HelloWorld;
import com.pattern.ssm.chapter2.proxy.HelloWorldImpl;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 14:39
 */
public class TestInterceptor {
	public static void main(String[] args) {
      // testInterceptor();
		testChain();
	}

	public static void testInterceptor(){
		HelloWorld proxy = (HelloWorld) IntercepterJdkProxy.bind(new HelloWorldImpl(),"com.pattern.ssm.chapter2.intercept.MyInterceptor");
		proxy.sayHelloWorld();
	}

	public static void testChain(){
		HelloWorld proxy1 = (HelloWorld) IntercepterJdkProxy.bind(new HelloWorldImpl(),"com.pattern.ssm.chapter2.intercept.Intercepter1");
		HelloWorld proxy2 = (HelloWorld) IntercepterJdkProxy.bind(proxy1,"com.pattern.ssm.chapter2.intercept.Intercepter2");
		HelloWorld proxy3 = (HelloWorld) IntercepterJdkProxy.bind(
				proxy2, "com.pattern.ssm.chapter2.intercept.Intercepter3");
		proxy3.sayHelloWorld();
	}
}
