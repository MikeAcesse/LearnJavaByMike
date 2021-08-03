package imooc.threads.chapter16;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/3 17:34
 */
public class Main {
	public static void main(String[] args) {
		// 创建任务
		Task task = new Task(1, 100);
		// 创建 ForkJoin 线程池
		ForkJoinPool threadPool = new ForkJoinPool();
		// 提交任务
		ForkJoinTask<Integer> future = threadPool.submit(task);
		try {
			// 获取结果
			Integer result = future.get();
			// 输出结果
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			// 关闭线程池
			threadPool.shutdown();
		}
	}
}
