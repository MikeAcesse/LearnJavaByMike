package com.imooc.createthreads.wrongways;

/**
 * @author fanzk
 * @version 1.8 lambda表达式创建线程
 * @date 2020/7/8 10:07
 */
public class Lambda {
	public static void main(String[] args) {
		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
	}
}
