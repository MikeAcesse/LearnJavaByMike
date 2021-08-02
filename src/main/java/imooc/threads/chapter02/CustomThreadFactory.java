package imooc.threads.chapter02;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 10:59
 */
public class CustomThreadFactory implements ThreadFactory {

	private final AtomicInteger i = new AtomicInteger(1);

	@Override
	public Thread newThread(Runnable r) {
		//创建线程，并指定任务
		Thread thread = new Thread(r);
		//设置线程名称
		thread.setName("线程"+i.getAndIncrement()+"号");
		//返回线程
		return thread;
	}
}
