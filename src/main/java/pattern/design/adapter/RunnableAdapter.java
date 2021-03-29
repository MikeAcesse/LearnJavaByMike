package pattern.design.adapter;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/25 17:52
 */
public class RunnableAdapter implements Runnable {
	private Callable<?> callable;

	public RunnableAdapter(Callable<?> callable){
		this.callable = callable;
	}


	@Override
	public void run() {
		try {
			callable.call();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
