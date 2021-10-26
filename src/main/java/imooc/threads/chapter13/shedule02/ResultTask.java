package imooc.threads.chapter13.shedule02;

import java.time.LocalTime;
import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 15:15
 */
public class ResultTask implements Callable<String> {
	@Override
	public String call() throws Exception {
		return LocalTime.now().toString();
	}
}
