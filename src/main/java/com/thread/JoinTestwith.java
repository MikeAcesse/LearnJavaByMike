package com.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/23 17:17
 */
public class JoinTestwith implements Runnable {
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
			try {
				test.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finished---");
	}


	//join方法的作用是父线程等待子线程执行完成后再执行，换句话说就是将异步执行的线程合并为同步的线程。
}
