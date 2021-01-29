package com.imooc.stopthread.volatiledemo;

/**
 * @author fanzk
 * @version 1.8     演示用volatile的局限：part1 看似可行
 * @date 2020/7/2 15:22
 */
public class WrongWayVolatile implements Runnable{
	private volatile  boolean canceled = false;
	@Override
	public void run() {
          int num = 0;
          try{
             while (num <= 100000 && !canceled){
             	if(num % 100 ==0){
	               // System.out.println(canceled);
	                System.out.println(num + "是100的倍数。");
                }
             	num++;
             	Thread.sleep(1);
             }
          }catch (InterruptedException e){
          	  e.printStackTrace();
          }
	};

	public static void main(String[] args) throws InterruptedException {
		WrongWayVolatile r = new WrongWayVolatile();
		Thread thread = new Thread(r);
		thread.start();
		Thread.sleep(5000);
		r.canceled = true;
		System.out.println(r.canceled);
	}
}
