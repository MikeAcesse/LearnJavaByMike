package com.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/23 16:36
 */
public class SleepTest {
	public synchronized void sleepMethod(){
		System.out.println("Sleep start --------");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sleep end ------");
	}

	public synchronized  void waitMethod(){
		System.out.println("Wait start ---------");
		synchronized (this){
			try {
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Wait end ---------");
	}

	/**
	 * 通过sleep方法实现的暂停，程序是顺序进入同步方法块的，只有当上一个线程执行完成的时候，下一个线程才能进入同步方法块，
	 * sleep 暂停期间一直有monitor对象锁，其他线程是不能进入的。而wait 方法则不同，当调用wait 方法后，当前线程会释放持有的monitor对象锁，
	 * 因此 其他线程备唤醒后，需要竞争锁，获取到锁之后在继续执行
	 * @param args
	 */

	public static void main(String[] args) {
         SleepTest test1 = new SleepTest();
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					test1.sleepMethod();
				}
			}).start();
		}
		try {
			Thread.sleep(10000); //暂停10秒，等上面的程序执行完毕
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("分割线---------------");
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					test1.waitMethod();
				}
			}).start();
		}
	}
}
