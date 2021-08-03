package imooc.threads.chapter09.interupt;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/3 16:52
 */
public class Task implements Runnable{
	/**
	 * 任务编号
	 */
	private final int index;

	public Task(int index) {
		this.index = index;
	}

	@Override
	public void run() {
		// 无限输出
		for(;;){
			//当线程被中断
			if(Thread.interrupted()){
				return;
			}
			System.out.println(Thread.currentThread().getName() + "：" + index);
		}

	}
}
