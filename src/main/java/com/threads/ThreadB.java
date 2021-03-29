package com.threads;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/29 10:36
 */
public class ThreadB implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(500L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"这是线程B");
	}
}
