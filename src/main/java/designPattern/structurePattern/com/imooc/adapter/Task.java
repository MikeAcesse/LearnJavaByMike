package designPattern.structurePattern.com.imooc.adapter;

import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/10/11 11:34
 */
public class Task implements Callable<Long> {
	private long num;

	public Task(long num) {
		this.num = num;
	}

	@Override
	public Long call() throws Exception {
		long r = 0;
		for (long n = 0; n < this.num; n++) {
			r = r + n;
		}
		System.out.println("result: "+r);
		return r;
	}
}
