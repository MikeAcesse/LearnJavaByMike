package com.imooc.uncaughtexception;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/8 9:24
 */
public class UseOwnUncaughtExceptionHandler implements Runnable{
	@Override
	public void run() {
		throw new RuntimeException();
	}

	public static void main(String[] args) throws InterruptedException {
		Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler("捕获器1"));
		new Thread(new UseOwnUncaughtExceptionHandler(),"MyThread-1").start();
		Thread.sleep(300);
		new Thread(new UseOwnUncaughtExceptionHandler(),"MyThread-2").start();
		Thread.sleep(300);
		new Thread(new UseOwnUncaughtExceptionHandler(),"MyThread-3").start();
		Thread.sleep(300);
		new Thread(new UseOwnUncaughtExceptionHandler(),"MyThread-4").start();
		Thread.sleep(300);
	}
}
