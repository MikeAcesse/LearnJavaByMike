package imooc.threads.chapter18;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/3 17:50
 */
public class Main {
	public static void main(String[] args) {
		// 创建带监控的线程池
		MonitorThreadPool threadPool = new MonitorThreadPool(1, 3, 0,
				TimeUnit.SECONDS, new LinkedBlockingQueue<>(2));
		try {
			// 提交多个任务
			for (int i = 5; i > 0; i--) {
				// 创建任务
				Task task = new Task(i);
				// 提交任务
				threadPool.submit(task);
				// 每隔500毫秒提交一个
				Thread.sleep(500);
			}
			// 使主线程休眠6秒钟
			Thread.sleep(6000);
			// 关闭线程池之前获取一次情况
			threadPool.monitor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// 关闭线程池
			threadPool.shutdown();
		}
	}
}
