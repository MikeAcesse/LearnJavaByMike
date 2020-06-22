package com.imooc.thread;

import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/19 15:40
 */
public class TestThread3 {
	@Test
	public void test() throws InterruptedException {
        Thread t = new MyThread3();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
		System.out.println("end");
	}
}
class MyThread3 extends Thread{
	@Override
	public void run() {
		Thread hello = new HelloThread();
		hello.start();
		try {
			hello.join();
		} catch (InterruptedException e) {
			System.out.println("interrupted！");
		}
		hello.interrupt();
	}
}
class HelloThread extends Thread{
	@Override
	public void run() {
		int n = 0;
		while(! isInterrupted()){
			n++;
			System.out.println(n+ " hello!");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
