package pattern.design.adapter;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/25 17:57
 */
public class Task implements Callable<Long> {

	private long num;
	public Task(long num){
		this.num = num;
	}

	@Override
	public Long call() throws Exception {
		long r = 0 ;
		for (long n = 1; n <= this.num; n++) {
			r = r +n;
		}
		System.out.println("Result: "+r);
		return r;
	}
}
