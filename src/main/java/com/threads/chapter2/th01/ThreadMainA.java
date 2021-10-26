package com.threads.chapter2.th01;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/29 10:34
 */
public class ThreadMainA {
	public static void main(String[] args) {
		ThreadA threada = new ThreadA();
		threada.start();
		System.out.println(Thread.currentThread().getName()+" 这是主线程");
	}
}
