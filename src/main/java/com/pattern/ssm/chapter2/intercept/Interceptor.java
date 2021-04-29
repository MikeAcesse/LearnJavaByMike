package com.pattern.ssm.chapter2.intercept;

import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 14:06
 */
public interface Interceptor {
	public boolean before(Object proxy, Object target, Method method, Object[] args);
	public void around(Object proxy,Object target,Method method,Object[] args);
	public void after(Object proxy,Object target,Method method,Object[] args);
}
