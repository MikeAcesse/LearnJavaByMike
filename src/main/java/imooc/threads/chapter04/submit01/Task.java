package imooc.threads.chapter04.submit01;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 13:36
 */
public class Task implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
