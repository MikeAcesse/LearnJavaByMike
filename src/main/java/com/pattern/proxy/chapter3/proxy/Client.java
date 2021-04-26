package com.pattern.proxy.chapter3.proxy;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/25 18:24
 * 测试类
 */
public class Client {
	public static void main(String[] args) throws IllegalAccessException, IOException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {
		Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class);
		m.move();
	}
}
