package com.pattern.proxy.chapter3.jdkproxy;

import com.pattern.proxy.chapter3.proxy.Car;
import com.pattern.proxy.chapter3.proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/25 19:37
 * JDK 动态代理测试类
 */
public class Test {
	public static void main(String[] args) {
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader 类加载器
		 * interfaces 实现接口
		 * h InvocationHandler
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);
		m.move();
	}
}
