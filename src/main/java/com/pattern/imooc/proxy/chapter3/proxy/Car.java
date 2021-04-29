package com.pattern.imooc.proxy.chapter3.proxy;

import java.util.Random;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/25 18:17
 */
public class Car implements Moveable {
	@Override
	public void move() {
		//实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中。。。");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
