package imooc.threads.chapter14.fixedRate;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.concurrent.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 14:37
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		Task task = new Task();
		//创建调度线程池
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		//输出当前时间
		System.out.println("输出当前时间->"+LocalTime.now());
		//提交任务
		ScheduledFuture<?> future = scheduledThreadPool.scheduleAtFixedRate(task,2,8, TimeUnit.SECONDS);
		try {
			//使当前线程休眠5秒
			TimeUnit.SECONDS.sleep(60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//取消任务
		future.cancel(false);
		//关闭线程池
		scheduledThreadPool.shutdown();
	}
}
