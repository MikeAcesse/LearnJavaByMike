package com.threads.chapter2.th07;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/7 9:27
 */
public class ThreadMain {
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
     // 1. 通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
		@Override
		protected Integer initialValue() {
			return 0;
		}
	};
	public ThreadLocal<Integer> getThreadLocal(){
		return seqNum;
	}

	// 2. 获取下一个序列值
	public int getNextNum(){
		seqNum.set(seqNum.get()+1);
		return seqNum.get();
	}

	public static void main(String[] args) {
              ThreadMain sn = new ThreadMain();
              // 3个线程共享sn,各自产生序列号
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		t1.start();
		t2.start();
		t3.start();
	}
	private static class TestClient extends Thread{
           private ThreadMain sn;
           public TestClient(ThreadMain sn){
           	this.sn = sn;
           }

		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				// 每个线程打出3个序列值
				System.out.println("Thread["+Thread.currentThread().getName()+"] -->sn["+sn.getNextNum()+"]");
			}
			sn.getThreadLocal().remove(); //每个线程用完的时候要记得删除
		}
	}
}