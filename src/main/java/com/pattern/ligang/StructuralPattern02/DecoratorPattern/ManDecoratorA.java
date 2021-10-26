package com.pattern.ligang.StructuralPattern02.DecoratorPattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:30
 */
public class ManDecoratorA extends Decorator {
	@Override
	public void eat(){
		super.eat();
		reEat();
		System.out.println("ManDecoratorA 类");
	}

	private void reEat() {
		System.out.println("再吃一顿饭");
	}
}
