package imooc.threads.chapter13.shedule01;

import java.time.LocalTime;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/5 15:05
 */
public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println(LocalTime.now());
	}
}
