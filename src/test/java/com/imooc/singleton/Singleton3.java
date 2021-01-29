package com.imooc.singleton;

/**
 * @author fanzk
 * @version 1.8  懒汉式（线程不安全）
 * @date 2020/7/19 13:13
 */
public class Singleton3 {
	private static Singleton3 instance;
	private Singleton3(){

	}
	public static Singleton3 getInstance(){
		if(instance == null){
			instance = new Singleton3();
		}
		return instance;
	}
}
