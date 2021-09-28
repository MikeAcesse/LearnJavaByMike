package imooc.mthread.part40;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 10:39
 */
public class Main {
	public static volatile  boolean stopped = false;
	public static volatile int i = 0 ;
	public static void main(String[] args) {

		//创建线程
		Thread thread = new Thread() {

			@Override
			public void run() {
				//当stopped 为true 时停止循环
				while(!stopped){
					i=i+1;
					System.out.println("while 循环中 "+i);
				}
				System.out.println("while循环结速");
			}
		};
		//启动线程
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//停止循环
		stopped = true;

	}
}
