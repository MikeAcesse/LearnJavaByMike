package imooc.mthread.part20;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 17:38
 */
public class Consumer implements Runnable {
	private final Data data;

	public Consumer(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		//无限消费
		while(true){
			synchronized (data){
				//当数据不为空的时候
				if(data.getMessage() != null){
					//消费数据
					System.out.println("消费： "+data.getMessage());
					//重置数据
					data.setMessage(null);
				}
				//唤醒生产者线程
				data.notify();
				try {
					data.wait(); //是当前线程等待
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
