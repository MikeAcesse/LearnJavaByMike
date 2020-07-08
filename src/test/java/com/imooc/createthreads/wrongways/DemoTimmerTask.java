package com.imooc.createthreads.wrongways;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/8 9:45
 */
public class DemoTimmerTask {
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		},1000,1000);
	}
}
