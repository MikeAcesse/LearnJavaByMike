package imooc.threads.chapter14.FixedDelay;

import java.time.LocalTime;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 15:00
 */
public class Task implements Runnable{

	@Override
	public void run() {
		System.out.println(LocalTime.now());
		try {
			// 使当前线程休眠 1 秒钟，模拟任务执行时长
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
