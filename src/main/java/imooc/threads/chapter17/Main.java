package imooc.threads.chapter17;

import java.util.concurrent.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 17:39
 */
public class Main {
	public static void main(String[] args) {
		//创建线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		//创建ExecutorCompletionService对象
		ExecutorCompletionService<Integer> completionService = new ExecutorCompletionService<>(threadPool);
		//多提交任务
		for (int i = 0; i < 5; i++) {
			//创建任务
			Task task = new Task(i);
			//提交任务
			completionService.submit(task);
		}
		try {
			// 获取多个任务执行结果
			for (int i = 0; i < 5; i++) {
				// 获取 Future
				Future<Integer> future = completionService.take();
				// 获取执行结果
				int result = future.get();
				// 输出执行结果
				System.out.println("返回顺序：" + result);
			}
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			// 关闭线程池
			threadPool.shutdown();
		}
	}
}
