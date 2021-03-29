package com.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/29 10:22
 */
public class ThradMainC {
	public static void main(String[] args) {
		ThreadC threadC = new ThreadC();
		FutureTask<String> feature = new FutureTask<String>(threadC);
		new Thread(feature).start(); //注意启动方式有点不一样
		System.out.println(Thread.currentThread().getName()+"这是主线程：begin!");
		try {
			System.out.println(Thread.currentThread().getName()+" 得到的返回结果是： "+feature.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"这是主线程：end");
	}
}
