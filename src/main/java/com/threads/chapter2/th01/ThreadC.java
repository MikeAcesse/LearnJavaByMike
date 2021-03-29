package com.threads.chapter2.th01;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/29 10:18
 */
public class ThreadC implements Callable<String> {
	//实现Callable接口，实现call（） 方法
	// 可以有返回结果，注意这次是要覆盖call方法
	@Override
	public String call() throws Exception {
		try {
			Thread.sleep(500L);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 这是线程 B");
		return "thread B";
	}
}
