package imooc.threads.chapter02;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 10:56
 */
public class Task implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"fan");
	}
}
