package imooc.mthread.part25;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/28 14:42
 * 数据
 */
public class Data {
	private Lock lock = new ReentrantLock();
	/**
	 * 生产者条件
	 */
	private Condition producerCondition = lock.newCondition();
	/**
	 * 消费者条件
	 */

}
