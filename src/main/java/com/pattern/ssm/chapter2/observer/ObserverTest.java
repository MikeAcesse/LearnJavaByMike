package com.pattern.ssm.chapter2.observer;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 10:59
 */
public class ObserverTest {
	public static void main(String[] args) {
		ProductList observable = ProductList.getInstance();
		TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
		JingDongObserver jingDongObserver = new JingDongObserver();
		observable.addObserver(jingDongObserver);
		observable.addObserver(taoBaoObserver);
		observable.addProduct("kuzi");
	}
}
