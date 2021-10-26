package com.pattern.ssm.chapter2.intercept;

import org.apache.poi.ss.formula.functions.Intercept;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 14:21
 */
public class IntercepterJdkProxy implements InvocationHandler {
	private Object target; //真实的对象
	private String intercaptorClass = null; // 拦截器权限定名
	public IntercepterJdkProxy(Object target,String intercaptorClass){
		this.target = target;
		this.intercaptorClass = intercaptorClass;
	}

	/**
	 * 绑定委托对象并返回一个【代理占位】
	 * @param target 真实对象
	 * @param intercaptorClass
	 * @return 代理对象【占位】
	 */
	public static Object bind(Object target,String intercaptorClass){
       //取得代理对象
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
				new IntercepterJdkProxy(target,intercaptorClass));
	}

	/**
	 * 通过代理对象调用方法，首先进入这个方法
	 * @param proxy  --代理对象
	 * @param method  --方法，被调用的方法
	 * @param args --方法参数
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(intercaptorClass == null){
			//没有设置拦截器则直接反射原有的方法
			return method.invoke(target,args);
		}
		Object result=null;
		//通过反射生成拦截器
		Interceptor interceptor = (Interceptor) Class.forName(intercaptorClass).newInstance();
		//调用前置方法
		if(interceptor.before(proxy,target,method,args)){
			//反射原有对象方法
			result = method.invoke(target,args);
		}else{ //返回false 执行around方法
			interceptor.around(proxy,target,method,args);
		}
		//调用后置方法
		interceptor.after(proxy,target,method,args);
		return result;
	}
}
