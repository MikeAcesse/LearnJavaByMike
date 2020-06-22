package com.imooc.thread2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 11:30
 */
public class Main {
	public static void main(String[] args) {
            ExecutorService es = Executors.newFixedThreadPool(4);
		for (int i = 0; i < 6; i++) {
			es.submit(new Task("" + i ));

		}
		es.shutdown();
	}
}
class Task implements  Runnable{
	private final String name;
	public Task(String name){
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println("Start task "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End task "+name);
	}
}
