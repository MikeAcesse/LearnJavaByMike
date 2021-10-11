package designPattern.structurePattern.com.imooc.adapter;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/10/11 11:34
 */
public class RunnableAdapter implements Runnable{
	private Callable<?> callable;

	public RunnableAdapter(Callable<?> callable) {
		this.callable = callable;
	}

	@Override
	public void run() {
		try {
			callable.call();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
