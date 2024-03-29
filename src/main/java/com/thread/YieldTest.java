package com.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/23 16:59
 */
public class YieldTest implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			Thread.yield();
			//System.out.println(Thread.currentThread().getName()+" end");
		}

	}

	public static void main(String[] args) {
		YieldTest runn = new YieldTest();
		Thread t1 = new Thread(runn,"FirstThread");
		Thread t2 = new Thread(runn,"SecondThread");
		t1.start();
		t2.start();
	}
}
