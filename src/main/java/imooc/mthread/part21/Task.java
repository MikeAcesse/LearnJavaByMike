package imooc.mthread.part21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 18:01
 */
public class Task implements Runnable {
	 private  Lock lock = new ReentrantLock();

	@Override
	public void run() {
		//获取锁
		lock.lock();
		//输出当前线程名称
		try {
			try {
				//使当前线程休眠1秒钟
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		} finally {
			//释放锁
			lock.unlock();
		}
	}
}
