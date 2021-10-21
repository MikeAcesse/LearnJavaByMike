package com.pattern.ligang.StructuralPattern02.ProxyPattern;


/**
 * @author fanzk
 * @version 1.8
 * @date 2021/10/21 16:22
 */
public class ProxyObject implements Object {
	Object obj;
	public ProxyObject(){
		System.out.println("这是代理类");
		obj = new ObjectImpl() {
		};
	}

	@Override
	public void action() {
		System.out.println("代理开始");
		obj.action();
		System.out.println("代理结束");
	}
}
