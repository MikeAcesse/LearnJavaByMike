package com.imooc.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 10:29
 */
public class TestThread8 {
	public static void main(String[] args) {
         Counter2 c1= new Counter2();
         Counter2 c2= new Counter2();
         new Thread( () -> { c1.add(10);}).start();
         new Thread( () -> { c1.dec(1);}).start();
         new Thread( () -> { c2.add(2);}).start();
         new Thread( () -> {c2.dec(1);}).start();
		System.out.println(c1.get());
		System.out.println(c2.get());

	}
}
class Counter2{
	private int count =0;
	public void add(int n ){
		synchronized (this){
			count +=n;
		}
	}
	public void dec(int n ){
		synchronized (this){
			count -=n;
		}
	}
	public int get(){
		return count;
	}
}
