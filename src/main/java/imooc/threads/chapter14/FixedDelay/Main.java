package imooc.threads.chapter14.FixedDelay;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 15:01
 */
public class Main {
	public static void main(String[] args) {
		// 创建任务
		Task task = new Task();
		// 创建调度线程池
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		// 输出当前时间
		System.out.println("main->"+LocalTime.now());
		// 提交任务
		ScheduledFuture<?> future = scheduledThreadPool.scheduleWithFixedDelay(task, 1, 2, TimeUnit.SECONDS);
		try {
			// 使当前线程休眠 5 秒钟
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 取消任务
		future.cancel(false);
		// 关闭线程池
		scheduledThreadPool.shutdown();
	}
}
