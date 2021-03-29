package com.threads;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/29 10:31
 */
public class ThreadA extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(500L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"这是线程A");
	}
}
