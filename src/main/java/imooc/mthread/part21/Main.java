package imooc.mthread.part21;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 18:05
 */
public class Main {
	public static void main(String[] args) {
		//创建任务
		Task task = new Task();
		//创建线程
		Thread thread1  = new Thread(task);
		Thread thread2 = new Thread(task);
		//启动线程
		thread1.start();
		thread2.start();
	}
}
