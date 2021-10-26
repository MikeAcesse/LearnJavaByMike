package com.pattern.csdn.adapter;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/13 11:12
 */
public class BirdAdapter implements Robot {
	Bird bird;
	public BirdAdapter(Bird bird){
		this.bird = bird;
	}
	@Override
	public void cry() {
		System.out.println("唧唧..........");
	}

	@Override
	public void move() {
		System.out.println("我在飞........");
	}
}
