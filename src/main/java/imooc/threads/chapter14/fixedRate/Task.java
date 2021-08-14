package imooc.threads.chapter14.fixedRate;

import java.time.LocalTime;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 14:35
 */
public class Task implements Runnable {
	@Override
	public void run() {
		System.out.println(LocalTime.now());
		try {
			Thread.sleep(5000); //使当前线程休眠1秒钟，模拟任务执行时长
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
