package imooc.threads.chapter18;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/3 17:49
 */
public class Task implements Runnable{
	public Task(int timeout) {
		this.timeout = timeout;
	}

	//执行时间
	private int timeout;



	@Override
	public void run() {

		try {
			// 使当前线程休眠指定时间
			Thread.sleep(timeout * 1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
