package com.pattern.ssm.chapter2.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 10:56
 */
public class JingDongObserver implements Observer {
	@Override
	public void update(Observable o, Object product) {
		String newProudct = (String) product;
		System.err.println("发送新产品 【"+newProudct+"】同步到京东商城");
	}
}
