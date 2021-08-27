package imooc.mthread.part32;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/27 10:07
 * 先进先出互斥锁
 */
public class FIFOMutex {
	/**
	 * 锁标志
	 */
	private final AtomicBoolean locked = new AtomicBoolean(false);
	/**
	 * 线程等待队列
	 */
	private final Queue<Thread> waiters = new ConcurrentLinkedDeque<>();
	/**
	 * 获取锁
	 */
	public void lock(){
		//是否被中断
		boolean wasInterrupted = false;
		//获取当前的线程
		Thread current = Thread.currentThread();
		//加入线程等待队列
		waiters.add(current);
		//当当前线程不是队列中的第一个或没有获取到锁时
		while(waiters.peek() != current ||
		       !locked.compareAndSet(false,true)){
			//使当前线程等待
			LockSupport.park();
			//被唤醒后，判断当前线程是否被中断并清除中断状态
			if(Thread.interrupted()){
				//记录当前线程被中断
				//但是在等待时忽略中断
				wasInterrupted = true;
			}
		}
		//获取锁之后将当前线程移出队列
		waiters.remove();
		//当当前线程被中断时
		if(wasInterrupted){
			//在退出时重新申明中断状态
			current.interrupt();
		}

	}

	/**
	 * 释放锁
	 */

	public void unlock(){
		//将锁标志设置false
		locked.set(false);
		//唤醒指定线程
		LockSupport.unpark(waiters.peek());
	}
}
