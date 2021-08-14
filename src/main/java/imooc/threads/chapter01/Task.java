package imooc.threads.chapter01;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 9:54
 */
public class Task implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
