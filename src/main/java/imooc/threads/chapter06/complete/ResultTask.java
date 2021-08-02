package imooc.threads.chapter06.complete;


import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 14:37
 */
public class ResultTask implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		// 返回1+1的值
		return 1 + 1;
	}
}
