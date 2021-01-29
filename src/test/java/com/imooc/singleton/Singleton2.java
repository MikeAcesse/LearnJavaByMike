package com.imooc.singleton;

/**
 * @author fanzk
 * @version 1.8 饿汉式（静态代码块）（可用）
 * @date 2020/7/19 13:09
 */
public class Singleton2 {
	private final static Singleton2 INSTANCE;
	static {
		INSTANCE = new Singleton2();
	}
	private Singleton2(){

	}
	public static Singleton2 getInstance(){
		return INSTANCE;
	}
	public static void main(String[] args) {
		Singleton2 s = Singleton2.getInstance();
		System.out.println(s);
	}
}
