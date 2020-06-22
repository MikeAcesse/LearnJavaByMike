package com.imooc.stopthread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/2 15:13
 */
public class RightWayStopThreadInProd2  implements Runnable{
	@Override
	public void run() {
		while(true){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("Interrupted,程序运行结束");
				break;
			}
			reInterrupt();
		}
	}

	private void reInterrupt() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("11111111111111");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new RightWayStopThreadInProd2());
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
	}
}
