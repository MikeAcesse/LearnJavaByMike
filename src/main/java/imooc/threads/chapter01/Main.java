package imooc.threads.chapter01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 9:54
 */
public class Main {
	public static void main(String[] args) {
          //创建任务
		Runnable task1 = new Task();
		Runnable task2= new Task();
		Runnable task3 = new Task();
		//创建一个线程的线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//提交任务
		threadPool.execute(task1);
		threadPool.execute(task2);
		threadPool.execute(task3);

		//关闭线程池
		threadPool.shutdown();
	}
}
