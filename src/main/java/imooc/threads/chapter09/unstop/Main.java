package imooc.threads.chapter09.unstop;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/3 16:49
 */
public class Main {
	public static void main(String[] args) {
		// 创建线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		// 提交任务
		threadPool.execute(new Task(1));
		// 关闭线程池
		List<Runnable> tasks = threadPool.shutdownNow();
		// 遍历返回的任务
		for (Runnable task : tasks) {
			task.run();
		}
	}
}
