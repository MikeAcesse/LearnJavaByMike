package threadcoreknowledge.createthreads;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/17 9:06
 */
public class RunnableStyle implements Runnable {
	@Override
	public void run() {
		System.out.println("用Runnable方法实现线程");
	}

	public static void main(String[] args) {
		Runnable target = new RunnableStyle();
		Thread thread = new Thread(target);
		thread.start();
	}
}
