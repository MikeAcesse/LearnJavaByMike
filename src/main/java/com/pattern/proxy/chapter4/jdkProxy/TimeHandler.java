package com.pattern.proxy.chapter4.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/25 19:45
 */
public class TimeHandler implements InvocationHandler {
	private Object target;
	public TimeHandler(Object target){
		super();
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long starttime = System.currentTimeMillis();
		System.out.println("汽车开始行驶。。。");
		method.invoke(target);
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶....  汽车行驶时间："
				+ (endtime - starttime) + "毫秒！");
		return null;
	}
}
