package imooc.threads.chapter04.execute;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 14:03
 */
public class Task implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("I fanzhikang");
	}
}
