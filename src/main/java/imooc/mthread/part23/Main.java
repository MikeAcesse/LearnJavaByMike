package imooc.mthread.part23;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 11:44
 */
public class Main {
	public static void main(String[] args) {
         //创建任务
		Task task = new Task();
		// 创建线程
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		// 启动线程
		thread1.start();
		thread2.start();

		try {
			// 使当前线程休眠1秒钟
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 中断线程
		thread2.interrupt();

	}
}
