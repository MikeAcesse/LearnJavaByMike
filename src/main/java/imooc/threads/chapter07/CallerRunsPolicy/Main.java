package imooc.threads.chapter07.CallerRunsPolicy;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 16:30
 */
public class Main {
	public static void main(String[] args) {
		//创建线程池
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1,1,0L,
				TimeUnit.SECONDS,new LinkedBlockingDeque<>(1), new ThreadPoolExecutor.CallerRunsPolicy());

		try {
			//提交任务
			threadPool.execute(new Task(1));
			threadPool.execute(new Task(2));
			threadPool.execute(new Task(3));
		} catch (RejectedExecutionException e) {
			e.printStackTrace();
		} finally {
			// 关闭线程池
			threadPool.shutdown();
		}

	}
}
