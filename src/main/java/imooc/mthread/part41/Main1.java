package imooc.mthread.part41;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 10:32
 */
public class Main1 {
	public static int i = 0 ;
	public static void main(String[] args) {
		//创建任务
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i++);
			}
		};
		//批量执行任务
		for (int j = 0; j < 10; j++) {
			//创建线程
			Thread thread= new Thread(task);
			//启动线程
			thread.start();

		}
	}
}
