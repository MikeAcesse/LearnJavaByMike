package com.imooc.singleton;

/**
 * @author fanzk
 * @version 1.8   饿汉式（静态常量）（可用）
 * @date 2020/7/19 13:06
 */
public class Singleton1 {
	private final static Singleton1 INSTANCE = new Singleton1();
	private Singleton1(){}
	public static Singleton1 getInstance(){
		return INSTANCE;
	}

	public static void main(String[] args) {
		Singleton1 s = Singleton1.getInstance();
		System.out.println(s);
	}

}
