package imooc.mthread.part20;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 17:33
 */
public class Producer implements Runnable {
	private final Data data;

	public Producer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		//计数器
		int i = 0;
		//无限生产
		while(true){
			synchronized (data){
				//当数据为空时
				if(data.getMessage() ==null){
					//生产数据
					data.setMessage("人人都是程序员"+ i++);
					System.out.println("生产： "+data.getMessage());
				}
				//唤醒消费者线程
				data.notify();
				try {
					data.wait(); //使当前线程等待
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
