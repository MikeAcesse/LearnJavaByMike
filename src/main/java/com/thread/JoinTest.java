package com.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/23 17:13
 * 不使用join方法：
 */
public class JoinTest implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" start ----");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" end---------");
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread test = new Thread(new JoinTest());
			test.start();
		}
		System.out.println("Finished---");
	}
}
