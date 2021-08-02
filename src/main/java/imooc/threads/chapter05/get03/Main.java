package imooc.threads.chapter05.get03;

import java.util.concurrent.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 14:48
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
			Integer result = future.get(5, TimeUnit.SECONDS);
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			System.out.println("在1秒钟内取结果超时");
			e.printStackTrace();
		}finally {
			threadPool.shutdown();
		}
	}
}
