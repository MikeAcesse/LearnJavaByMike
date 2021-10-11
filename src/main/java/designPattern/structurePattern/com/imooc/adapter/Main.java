package designPattern.structurePattern.com.imooc.adapter;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/10/11 11:34
 */
public class Main {
	public static void main(String[] args) throws InterruptedException {
		Callable<Long> callable = new Task(123450000L);
		Thread thread = new Thread(new RunnableAdapter(callable));
		thread.start();
		thread.join();
	}
}
