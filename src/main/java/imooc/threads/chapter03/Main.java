package imooc.threads.chapter03;

import java.util.concurrent.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 11:37
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		Task task1 = new Task();
		Task task2 = new Task();
		Task task3 = new Task();

		//创建线程池
//	ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10,25,10L, TimeUnit.SECONDS,
//			new LinkedBlockingDeque<>(),
//			Executors.defaultThreadFactory(),
//			new ThreadPoolExecutor.AbortPolicy());
		//创建固定大小的线程池
//		ExecutorService threadPool = Executors.newFixedThreadPool(10);

		//创建单个线程的线程池
//		ExecutorService threadPool = Executors.newSingleThreadExecutor();

		//创建可缓存的线程池
		ExecutorService threadPool = Executors.newCachedThreadPool();

		//提交任务
		threadPool.execute(task1);
		threadPool.execute(task2);
		threadPool.execute(task3);

		//关闭线程池
		threadPool.shutdown();

	}
}
