package imooc.mthread.part32;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/27 10:24
 */
public class Task implements Runnable {
	/**
	 * 互斥锁
	 */
	private final FIFOMutex lock = new FIFOMutex();

	@Override
	public void run() {
		//获取锁
		lock.lock();
		//使当前线程休眠3秒中
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			//释放锁
			lock.unlock();
		}

	}
}
