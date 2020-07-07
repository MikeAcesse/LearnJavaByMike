package com.imooc.threadobjectclasscommonmethods;

/**
 * @author fanzk
 * @version 1.8 3个线程，线程1 和线程2 首先被阻塞，线程3唤醒它们，notify,notifyall.start 先执行不代表线程启动
 * @date 2020/7/7 9:12
 */
public class WaitNotifyAll implements Runnable{
	private static final Object resourceA = new Object();
	@Override
	public void run() {
          synchronized (resourceA){
	          System.out.println(Thread.currentThread().getName()+" got resourceA lock");
	          try{
		          System.out.println(Thread.currentThread().getName()+ " waits to start");
		          resourceA.wait();
		          System.out.println(Thread.currentThread().getName()+" 's waiting to end");
	          }catch (InterruptedException e){
	          	e.printStackTrace();
	          }
          }
	}

	public static void main(String[] args) {
		Runnable r = new WaitNotifyAll();
		Thread threadA = new Thread(r);
		Thread threadB = new Thread(r);
		Thread threadC = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (resourceA){
					resourceA.notifyAll();
					System.out.println(" ThreadC notified.");
				}
			}
		});
		threadA.start();
		threadB.start();
		threadC.start();
	}
}
