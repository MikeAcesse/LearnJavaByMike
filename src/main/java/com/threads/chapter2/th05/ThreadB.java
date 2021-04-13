package com.threads.chapter2.th05;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/13 14:47
 */
public class ThreadB extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("线程B第"+i+"次执行！");
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
