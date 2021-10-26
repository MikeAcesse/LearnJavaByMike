package com.pattern.csdn.adapter;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/13 10:59
 */
public class BioRobot implements Robot {
	@Override
	public void cry() {
		System.out.println("仿生机器人叫。。。。。");
	}

	@Override
	public void move() {
		System.out.println("仿生机器人在移动。。。。");
	}
}
