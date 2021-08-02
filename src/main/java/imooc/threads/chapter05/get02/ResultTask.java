package imooc.threads.chapter05.get02;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 14:46
 */
public class ResultTask implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		//使当前线程休眠3秒钟
		TimeUnit.SECONDS.sleep(3);
		return 1 + 1;
	}
}
