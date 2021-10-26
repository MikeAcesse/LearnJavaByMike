package imooc.threads.chapter08;

import java.util.concurrent.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/3 11:28
 */
public class Main {
	public static void main(String[] args) {
		//创建线程池
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1,1,0L, TimeUnit.SECONDS,
				new LinkedBlockingQueue<>(),
				new ThreadPoolExecutor.AbortPolicy());
		try{
			//提交任务
			threadPool.execute(new Task(1));
			threadPool.execute(new Task(3));
		}catch(RejectedExecutionException e){
			e.printStackTrace();
		}finally {
			//关闭线程池
			threadPool.shutdown();
			//提交任务
			threadPool.execute(new Task(2));
		}
	}
}
