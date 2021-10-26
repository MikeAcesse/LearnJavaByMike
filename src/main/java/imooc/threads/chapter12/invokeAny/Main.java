package imooc.threads.chapter12.invokeAny;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 17:07
 */
public class Main {
	public static void main(String[] args) {
		// 创建任务列表
		List<Task> tasks = new ArrayList<>();
		// 填充任务列表
		for (int i = 1; i <= 10; i++) {
			// 添加任务
			tasks.add(new Task(i));
		}
		// 创建线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		try {
			// 提交任务列表
			Integer result = threadPool.invokeAny(tasks);
			// 输出执行结果
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			// 关闭线程池
			threadPool.shutdown();
		}
	}
}
