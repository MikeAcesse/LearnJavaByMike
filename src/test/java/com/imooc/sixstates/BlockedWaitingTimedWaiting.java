package com.imooc.sixstates;

/**
 * @author fanzk
 * @version 1.8   展示Blocked,Waiting,TimedWaiting
 * @date 2020/7/7 11:19
 */
public class BlockedWaitingTimedWaiting implements Runnable {
	@Override
	public void run() {
		syn();
	}

	private synchronized void syn(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
       BlockedWaitingTimedWaiting runnable = new BlockedWaitingTimedWaiting();
       Thread thread1 =new Thread(runnable);
       thread1.start();
       Thread thread2 = new Thread(runnable);
       thread2.start();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//打印出Timed_Waiting 状态，因为正在执行Thread.sleep(1000)
		System.out.println(thread1.getState());
		//打印出Blocked 状态，因为thread2想拿到sync()的锁却拿不到
		System.out.println(thread2.getState());
		try {
			Thread.sleep(1300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//打印出WAITING状态，因为执行了wait()
		System.out.println(thread1.getState());

	}
}
