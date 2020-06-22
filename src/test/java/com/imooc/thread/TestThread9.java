package com.imooc.thread;

import com.imooc.Main;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 10:38
 */
public class TestThread9 {
  static final Object LOCK_A = new Object();
  static final Object LOCK_B = new Object();

	public static void main(String[] args) {
		new Thread11().start();
		new Thread12().start();
	}
	static void sleep1s() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
class Thread11 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread-11 try get lock A...");
		synchronized (TestThread9.LOCK_A){
			System.out.println("Thread-11 lock A got.");
			TestThread9.sleep1s();
			System.out.println("Thread-11 try get lock B...");
			synchronized (TestThread9.LOCK_B){
				System.out.println("Thread-11: lock B got.");
				TestThread9.sleep1s();
			}
			System.out.println("Thread-11: lock B released.");
		}
		System.out.println("Thread-11: lock A released.");
	}
}
class Thread12 extends Thread{
	@Override
	public void run() {
		System.out.println("Thread-12 try get lock B...");
		synchronized (TestThread9.LOCK_B){
			System.out.println("Thread-12 lock B got");
			TestThread9.sleep1s();
			System.out.println("Thread-12 try get lock A...");
			synchronized (TestThread9.LOCK_A){
				System.out.println("Thread-12 lock A got");
				TestThread9.sleep1s();
			}
			System.out.println("Thread-12 lock A released");
		}
		System.out.println("Thread-12: lock B released.");
	}
}
