package com.imooc.createthreads.wrongways;

/**
 * @author fanzk
 * @version 1.8  匿名内部类的方式
 * @date 2020/7/8 9:42
 */
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		new Thread(){
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}.start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		}).start();
	}
}
