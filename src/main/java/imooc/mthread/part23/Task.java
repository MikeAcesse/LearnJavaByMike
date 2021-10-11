package imooc.mthread.part23;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 11:51
 */
public class Task implements Runnable {
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		try {
			//获取锁
			lock.lockInterruptibly();
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + "被中断");
			return;
		}

		try {
			//使当前线程休眠3秒中
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			//释放锁
			lock.unlock();
		}
	}
}
