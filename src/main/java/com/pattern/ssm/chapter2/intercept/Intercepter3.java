package com.pattern.ssm.chapter2.intercept;

import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 14:20
 */
public class Intercepter3 implements Interceptor {
	@Override
	public boolean before(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("【拦截器3】的before方法");
		return true;
	}

	@Override
	public void around(Object proxy, Object target, Method method, Object[] args) {

	}

	@Override
	public void after(Object proxy, Object target, Method method, Object[] args) {
		System.out.println("【拦截器3】的after方法");
	}
}
