package com.threads.chapter2.th08;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/7 11:12
 */
public class ExceptionHandlerThreadB implements Thread.UncaughtExceptionHandler {
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.printf("An exception has been captured\n");
		System.out.printf("Thread: %s\n",t.getId());
		System.out.printf("Exception: %s: %s\n",e.getClass().getName(),e.getMessage());
		System.out.printf("Stack Trace: \n");
		e.printStackTrace(System.out);
		System.out.printf("Thread status: %s\n",t.getState());
	}
}
