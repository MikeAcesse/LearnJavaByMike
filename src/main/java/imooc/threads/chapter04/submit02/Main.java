package imooc.threads.chapter04.submit02;

import org.apache.xpath.functions.FuncTrue;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 14:14
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		Task task = new Task();
		//创建单个线程的线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//提交任务
		Future<?> future = threadPool.submit(task);
		try {
			// 获取任务执行结果
			Object result = future.get();
			//输出任务执行结果
			System.out.println(result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}finally {
			//关闭线程池
			threadPool.shutdown();
		}

	}
}
