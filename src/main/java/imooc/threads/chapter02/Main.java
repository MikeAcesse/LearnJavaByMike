package imooc.threads.chapter02;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 10:57
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		Task  task1 = new Task();
		Task  task2 = new Task();
		Task  task3 = new Task();
		//创建线程池
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10,25,10L, TimeUnit.SECONDS,
				new LinkedBlockingDeque<>(),new CustomThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
		//提交任务
		threadPool.execute(task1);
		threadPool.execute(task2);
		threadPool.execute(task3);
		//关闭线程池
		threadPool.shutdown();
	}
}
