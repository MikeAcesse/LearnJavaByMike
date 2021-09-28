package imooc.mthread.part39;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.threadpool.TtlExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 10:49
 */
public class Main {
	public static void main(String[] args) {
         //创建线程池
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		//转化为可传输线程本地变量的线程池
		ExecutorService threadPool = TtlExecutors.getTtlExecutorService(executorService);
		//创建TransmittableThreadLocal
		TransmittableThreadLocal<String> tl = new TransmittableThreadLocal<>();
		//创建任务
		Runnable task = new Runnable() {
			@Override
			public void run() {
				//获取当前线程名称
				String name = Thread.currentThread().getName();
				//输出当前线程名称
				System.out.println("设置的数据： "+name);
				//设置线程本地变量
				tl.set(name);
				//创建提交给线程池的任务
				Runnable r = new Runnable() {
					@Override
					public void run() {
						System.out.println("获取的数据： "+tl.get());
					}
				};
				//提交Runnable 任务
				threadPool.execute(r);
			}
		};
		// 创建线程
		Thread thread0 = new Thread(task);
		Thread thread1 = new Thread(task);
		// 启动线程
		thread0.start();
		thread1.start();
	}
}
