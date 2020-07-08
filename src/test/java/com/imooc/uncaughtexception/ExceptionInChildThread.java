package com.imooc.uncaughtexception;

/**
 * @author fanzk
 * @version 1.8  单线程，抛出，处理，有异常堆栈 多线程，子线程发生异常，会有什么不同？
 * @date 2020/7/8 9:11
 */
public class ExceptionInChildThread implements Runnable{
	public static void main(String[] args) {
		new Thread(new ExceptionInChildThread()).start();
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		for (int i = 0; i <1000 ; i++) {
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		System.out.println("prepare to throw runtimeException");
		throw new RuntimeException();
	}
}
