package imooc.threads.chapter09.shutdownnow;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/3 16:36
 */
public class Task implements Runnable{
	//任务编号
	private final int index;
	public Task(int index){
		this.index = index;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "：" + index);
	}
}
