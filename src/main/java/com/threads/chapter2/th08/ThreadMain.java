package com.threads.chapter2.th08;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/7 11:21
 */
public class ThreadMain {
	public static void main(String[] args) {
		ThreadB task = new ThreadB();
		Thread thread = new Thread(task);
		thread.setUncaughtExceptionHandler(new ExceptionHandlerThreadB());
		thread.start();
	}
}
