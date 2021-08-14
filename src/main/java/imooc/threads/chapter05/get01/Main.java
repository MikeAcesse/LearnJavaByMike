package imooc.threads.chapter05.get01;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 14:40
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		ResultTask task = new ResultTask();
		//创建单个线程的线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//提交任务
		Future<Integer> future = threadPool.submit(task);
		try {
			Integer result = future.get();
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}finally {
			threadPool.shutdown();
		}
	}
}
