package com.imooc.stopthread;

/**
 * @author fanzk
 * @version 1.8 Thread.interrupted() 方法的目标对象是当前线程，而不管本方法来自于哪个对象
 * @date 2020/7/2 14:22
 */
public class RightWayInterrupted {
	public static void main(String[] args) throws InterruptedException {
		Thread threadone = new Thread(new Runnable() {
			@Override
			public void run() {
				for(;;){
					//System.out.println("我是run（）");
				}
			}
		});

		threadone.start();
		threadone.interrupt(); //设置中断标志
		System.out.println("isInterrupted: "+ threadone.isInterrupted());   //获取中断标志
		//获取中断标志并重置
		System.out.println("threadone.interrupted(): " + threadone.interrupted());
		//获取中断标志并重置
		System.out.println("Thread.interrupted():"+Thread.interrupted());
		//获取中断标志
		System.out.println("threadone.isInterrupted(): "+ threadone.isInterrupted());   //获取中断标志

		//获取中断标志并重置
		System.out.println("threadone.interrupted(): " + threadone.interrupted());
		//获取中断标志并重置
		System.out.println("Thread.interrupted():"+Thread.interrupted());
		threadone.join();
		System.out.println("Main thread is over");

	}
}
