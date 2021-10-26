package com.pattern.ssm.chapter2.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 10:58
 */
public class TaoBaoObserver implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		String newProudct = (String) arg;
		System.err.println("发送新产品【"+newProudct+"】同步到淘宝商城");
	}
}
