package imooc.mthread.part20;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/26 17:41
 */
public class Main {
	public static void main(String[] args) {
		//创建数据
		Data data = new Data();
		//创建生产者，消费者任务
		Producer producer = new Producer(data);
		Consumer consumer = new Consumer(data);
		//创建生产者，消费者线程
		Thread producerThread = new Thread(producer);
		Thread consumerThead = new Thread(consumer);
		//启动线程
		producerThread.start();
		consumerThead.start();

	}
}
