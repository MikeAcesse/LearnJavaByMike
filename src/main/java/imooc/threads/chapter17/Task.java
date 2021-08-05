package imooc.threads.chapter17;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 17:36
 */
public class Task implements Callable<Integer> {
	//执行时间
	private int timeout;

	public Task(int timeout) {
		this.timeout = timeout;
	}

	@Override
	public Integer call() throws Exception {
		//输出执行时间
		System.out.println("执行时间： "+timeout);
		//使当前线程休眠指定时间
		Thread.sleep(timeout * 100L);
		//返回执行时间
		return timeout;
	}
}
