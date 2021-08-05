package imooc.threads.chapter12.invokeAll;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 17:07
 */
public class Task implements Callable<Integer> {
    //任务编号
	private final int index;

	public Task(int index) {
		this.index = index;
	}

	@Override
	public Integer call() throws Exception {
		//使当前线程休眠1秒钟
		Thread.sleep(1000);
		return index;
	}
}
