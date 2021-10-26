package com.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/23 16:20
 */
public class NotifyTest {
	public synchronized void testWait(){
		System.out.println(Thread.currentThread().getName()+" Start----------");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"End---------");
	}

	/**
	 * （1）调用wait方法后，线程是会释放对monitor对象的所有权的。
	 *
	 * 　　（2）一个通过wait方法阻塞的线程，必须同时满足以下两个条件才能被真正执行：
	 *
	 *     　　　　线程需要被唤醒（超时唤醒或调用notify/notifyll）。
	 *     　　　　线程唤醒后需要竞争到锁（monitor）。
	 * @param args
	 */
	public static void main(String[] args) {
		final NotifyTest test = new NotifyTest();
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					test.testWait();
				}
			}).start();
		}
		synchronized (test){
			test.notify();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("================================");
		synchronized (test){
			test.notifyAll();
		}
		System.out.println(Thread.currentThread().getName()+" end............");
	}
}
