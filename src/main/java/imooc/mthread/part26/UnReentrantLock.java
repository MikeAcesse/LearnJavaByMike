package imooc.mthread.part26;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 14:16
 * 不可重入锁
 */
public class UnReentrantLock implements Lock {

	private Thread thread; // 当前绑定的线程
	@Override
	public void lock() {
		synchronized (this){
			//当已有线程拿到锁时
			while(thread != null){
				//是当前线程等待
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//绑定当前线程
			this.thread = Thread.currentThread();
		}

	}

	@Override
	public void lockInterruptibly() throws InterruptedException {

	}

	@Override
	public boolean tryLock() {
		return false;
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
		return false;
	}

	@Override
	public void unlock() {
		synchronized (this){
			//当绑定的线程不是当前线程
			while (thread != Thread.currentThread()){
				return;
			}
			//解锁线程
			thread  = null ;
			//唤醒所有的线程
			notifyAll();
		}

	}

	@Override
	public Condition newCondition() {
		return null;
	}
}
