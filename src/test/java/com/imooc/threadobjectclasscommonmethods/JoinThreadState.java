package com.imooc.threadobjectclasscommonmethods;

/**
 * @author fanzk
 * @version 1.8 先join 再mainThread.getState(),通过debugger 看线程join前后状态的对比
 * @date 2020/7/6 9:25
 */
public class JoinThreadState {
	public static void main(String[] args) throws InterruptedException {
      Thread mainThread = Thread.currentThread();
      Thread thread = new Thread(new Runnable() {
	      @Override
	      public void run() {
		      try {
			      Thread.sleep(3000);
			      System.out.println(mainThread.getState());
			      System.out.println("Thread-0运行结束");
		      } catch (InterruptedException e) {
			      e.printStackTrace();
				  System.out.println("子线成终端了");
		      }
	      }
      });
        thread.start();
		System.out.println("等待子线程运行完毕");
		thread.join();

		System.out.println("子线程运行完毕");
	}
}
