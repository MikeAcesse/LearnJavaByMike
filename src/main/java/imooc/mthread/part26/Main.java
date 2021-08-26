package imooc.mthread.part26;

import java.util.concurrent.locks.Lock;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 14:40
 */
public class Main {
	public static void main(String[] args) {
		// 创建不可重入锁
		Lock lock = new UnReentrantLock();
		//获取锁
		lock.lock();
		try {
			System.out.println("第一次获取锁");
			//获取锁
			lock.lock();
			try {
				System.out.println("第二次获取锁");
			} finally {
				//释放锁
				lock.unlock();
			}
		} finally {
			//释放锁
			lock.unlock();
		}

	}
}
