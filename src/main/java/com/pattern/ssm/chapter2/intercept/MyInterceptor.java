package com.pattern.ssm.chapter2.intercept;

import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 14:36
 */
public class MyInterceptor implements Interceptor {
	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.err.println("反射方法前逻辑");
		return false; //不反射被代理对象原有方法
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {
		System.err.println("取代了被代理对象的方法");
	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.err.println("反射方法后逻辑。");
	}
}
