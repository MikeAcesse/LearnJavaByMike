package imooc.threads.chapter13.shedule01;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 15:06
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		Task task = new Task();
		//创建调度线程池
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		//输出当前时间
		System.out.println("main-》"+ LocalTime.now());
		//提交任务
		scheduledThreadPool.schedule(task,3, TimeUnit.SECONDS);
		//关闭线程池
		scheduledThreadPool.shutdown();
	}
}
