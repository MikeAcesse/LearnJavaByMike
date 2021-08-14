package imooc.threads.chapter13.shedule02;

import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 15:17
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		ResultTask task = new ResultTask();
		//创建调度线程池
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		System.out.println("main -> "+ LocalTime.now());
		//提交任务
		ScheduledFuture<String> future = scheduledThreadPool.schedule(task,3, TimeUnit.SECONDS);
		//输出任务结果
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}finally {
			scheduledThreadPool.shutdown();
		}
	}
}
