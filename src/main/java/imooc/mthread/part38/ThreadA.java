package imooc.mthread.part38;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 11:16
 */
public class ThreadA extends Thread {
	public static final InheritableThreadLocal<String> tl = new InheritableThreadLocal<>();

	@Override
	public void run() {
		//设置数据
		tl.set("renrenle");
		//创建线程
		ThreadB threadB = new ThreadB();
		//启动线程
		threadB.start();
	}
}
