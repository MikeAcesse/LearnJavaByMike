package imooc.mthread.part38;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 11:16
 */
public class ThreadB extends Thread {
	@Override
	public void run() {
		//获取数据
		System.out.println(ThreadA.tl.get());
	}
}
