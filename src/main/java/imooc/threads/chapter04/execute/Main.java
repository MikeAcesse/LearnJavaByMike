package imooc.threads.chapter04.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 14:03
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		Task task = new Task();
		//创建单个线程的线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//提交任务
		threadPool.execute(task);
		//关闭线程池
		threadPool.shutdown();
	}
}
