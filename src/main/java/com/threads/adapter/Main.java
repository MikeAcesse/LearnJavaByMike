package com.threads.adapter;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/25 18:01
 */
public class Main {
	public static void main(String[] args) throws InterruptedException {
		Callable<Long> callable = new Task(123450000L);
		Thread thread = new Thread(new RunnableAdapter(callable));
		thread.start();
		thread.join();
	}
}
