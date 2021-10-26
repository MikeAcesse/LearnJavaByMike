package imooc.threads.chapter06.unexecute;

import javax.xml.bind.SchemaOutputResolver;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 15:29
 */
public class Main {
	public static void main(String[] args) {
		// 创建任务
		ResultTask task = new ResultTask();
		// 创建单个线程的线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		// 提交任务
		Future<Integer> future1 = threadPool.submit(task);
		Future<Integer> future2 = threadPool.submit(task);
		//取消任务
		boolean cancel = future2.cancel(false);
		System.out.println("任务是否取消成功："+cancel);
		System.out.println("任务是否取消："+future2.isCancelled());

		//获取任务执行结果
		try {
			Integer result = future2.get();
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
