package imooc.mthread.part22;

import info2soft.qa.common.util.TimeUtil;

import java.util.concurrent.TimeUnit;
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
		//非阻塞获取锁
		try{
			if(lock.tryLock(3, TimeUnit.SECONDS)){
				try {
					//是当前线程休眠1秒钟
					Thread.sleep(1000);
					//输出当前线程名称
					System.out.println(Thread.currentThread().getName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else{
				System.out.println("锁被占用，执行其他任务");
			}
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
}
