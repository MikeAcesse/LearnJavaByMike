package imooc.threads.chapter08;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/3 11:28
 */
public class Task  implements Runnable {
	private final int index;
	public Task(int index){
		this.index = index;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+": "+index);
	}
}
