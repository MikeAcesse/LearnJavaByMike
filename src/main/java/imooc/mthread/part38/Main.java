package imooc.mthread.part38;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 11:16
 */
public class Main {
	public static void main(String[] args) {
		//创建线程
		ThreadA  threadA = new ThreadA();
		//启动线程
		threadA.start();
	}
}
