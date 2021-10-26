package com.threads.chapter2.th05;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/13 14:47
 */
public class ThreadMain {
	public static void main(String[] args) {
		Thread tA = new ThreadA();
		Thread tB = new ThreadB();
		tA.setDaemon(true); //设置为守护线程，注意一定要在开始之前调用
		tB.start();
		tA.start();
		Thread mainThread = Thread.currentThread();
		System.out.println("线程A是不是守护线程"+tA.isDaemon());
		System.out.println("线程B是不是守护线程"+tB.isDaemon());
		System.out.println("线程main是不是守护线程"+mainThread.isDaemon());
		/**
		 * 前台线程是保证执行完毕的，后台线程还没有执行完毕就退出
		 * （1） JRE 判断程序是否执行结束的标准是所有的前台执行线程完毕了，而不管后台线程的状态。因此使用后台线程的时候一定要注意这个问题
		 * （2）当进程中所有非守护线程已经结束或者退出时，即使仍有守护线程在运行，进程仍将结束。也就是说当程序结束了，守护线程也有可能仍然为退出。
		 */
	}
}
