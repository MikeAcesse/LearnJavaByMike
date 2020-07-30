package com.imooc.jmm;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fanzk
 * @version 1.8  不适用于volatile的场景
 * @date 2020/7/9 17:10
 */
public class NoVolatile implements Runnable {
	volatile int a;
	AtomicInteger realA = new AtomicInteger();

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			a++;
			realA.incrementAndGet();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable r =  new NoVolatile();
		Thread thread1 = new Thread(r);
		Thread thread2 = new Thread(r);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println(((NoVolatile) r).a);
		System.out.println(((NoVolatile) r).realA.get());
	}
}