package com.imooc.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 9:43
 */
public class TestMutilpleThread {
	public static void main(String[] args) throws InterruptedException {
          Thread add = new AddThread();
          Thread dec  = new DecThread();
          add.start();
          dec.start();
          add.join();
          dec.join();
		System.out.println(Counter.count);
	}
}
class Counter{
	public static final Object lock  = new  Object();
	public static final Object lock1= new Object();
	public static final Object lock2= new Object();
	public static int count =0;
}
class AddThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			synchronized (Counter.lock1){
				Counter.count +=1;
			}
		}
	}
}
class DecThread extends  Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			synchronized (Counter.lock2){
				Counter.count -=1;
			}
		}
	}
}
