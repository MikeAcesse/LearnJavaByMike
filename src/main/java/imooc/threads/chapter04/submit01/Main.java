package imooc.threads.chapter04.submit01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 13:38
 */
public class Main {
	public static void main(String[] args)  {
		//创建任务
		Task task = new Task();
		//创建单个线程的线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//提交任务
		//Future<String> future = threadPool.submit(task,"任务完成");
		Future<Integer> future = threadPool.submit(task,100);
		try {
//			String result = future.get();
//			System.out.println(result);
			int result = future.get();
			System.out.println(result);
		} catch (InterruptedException| ExecutionException e) {
			e.printStackTrace();
		} finally {
			threadPool.shutdown();
		}

	}
}
