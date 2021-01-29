package com.imooc.threadobjectclasscommonmethods;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanzk
 * @version 1.8 演示sleep不释放lock(lock 需要手动释放)
 * @date 2020/7/7 10:54
 */
public class SleepDontReleaseLock implements Runnable{
	private static final Lock lock = new ReentrantLock();
	@Override
	public void run() {
       lock.lock();
		System.out.println("线程" + Thread.currentThread().getName() + "获取到了锁");
		try {
			Thread.sleep(5000);
			System.out.println("线程" + Thread.currentThread().getName() + "已经苏醒");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		SleepDontReleaseLock sleepDontReleaseLock = new SleepDontReleaseLock();
		new Thread(sleepDontReleaseLock).start();
		new Thread(sleepDontReleaseLock).start();
	}
}
