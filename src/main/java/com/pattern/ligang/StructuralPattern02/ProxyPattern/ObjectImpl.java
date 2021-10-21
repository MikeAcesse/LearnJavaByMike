package com.pattern.ligang.StructuralPattern02.ProxyPattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/10/21 16:25
 * this is realSubject
 */
public class ObjectImpl implements Object {

	@Override
	public void action() {
		System.out.println("==============");
		System.out.println("==============");
		System.out.println("这是被代理的类");
		System.out.println("==============");
		System.out.println("==============");
	}
}
