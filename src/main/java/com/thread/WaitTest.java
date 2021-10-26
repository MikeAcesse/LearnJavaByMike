package com.thread;

import info2soft.qa.common.util.WaitUtil;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/23 15:41
 */
public class WaitTest {
	/**
	 * wait方法是一个本地方法，其底层是通过一个叫做监视器锁的对象来完成的。所以上面之所以会抛出异常，是因为在调用wait方式时没有获取到monitor对象的所有权，
	 * 那如何获取monitor对象所有权？Java中只能通过Synchronized关键字来完成，修改上述代码，增加Synchronized关键字：
	 */
	public synchronized void testWait(){  //增加synchronized ，wait 方法的使用必须在同步范围内，否则就会抛出IllegalMonitorStateException 异常，
		  //wait 方法的作用就是阻塞当前线程，等待notify/notifyAll 方法的唤醒， 或等待超时后自动唤醒
		System.out.println("Start-----");
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End-----");
	}

	public static void main(String[] args) {
		WaitTest test = new WaitTest();
		new Thread(new Runnable() {
			@Override
			public void run() {
				test.testWait();
			}
		}).start();
	}
}
