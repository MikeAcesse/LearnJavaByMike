package com.threads;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/29 10:38
 */
public class ThreadMainB {
	public static void main(String[] args) {
		ThreadB threadb = new ThreadB();
		new Thread(threadb).start();
		System.out.println(Thread.currentThread().getName()+"这是主线程");
	}
}
