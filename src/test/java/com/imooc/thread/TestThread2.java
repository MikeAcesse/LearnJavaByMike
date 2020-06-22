package com.imooc.thread;

import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/19 15:26
 */
public class TestThread2 {
	@Test
	public void testInterruptThread() throws InterruptedException {
		Thread t = new MyThread2();
		t.start();
		Thread.sleep(1);
		t.interrupt();
		t.join();
		System.out.println("end");

	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		int n=0;
		while(! isInterrupted()){
			n++;
			System.out.println(n+" hello!");

		}
	}
}