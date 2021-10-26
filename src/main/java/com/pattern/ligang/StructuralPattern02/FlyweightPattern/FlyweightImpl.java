package com.pattern.ligang.StructuralPattern02.FlyweightPattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/10/21 17:15
 */
public class FlyweightImpl implements Flyweight {
	@Override
	public void action(int arg) {
		System.out.println("参数值： "+arg);
	}
}
