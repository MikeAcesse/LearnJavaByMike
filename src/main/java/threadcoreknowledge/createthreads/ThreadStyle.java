package threadcoreknowledge.createthreads;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/17 9:30
 */
public class ThreadStyle extends Thread {
	@Override
	public void run() {
		System.out.println("用Thread类实现线程");
	}

	public static void main(String[] args) {
		new ThreadStyle().start();
	}
}
