package com.pattern.ligang.StructuralPattern02.DecoratorPattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:32
 */
public class ManDecoratorB extends Decorator {
	@Override
	public void eat(){
		super.eat();
		System.out.println("===================");
		System.out.println("ManDecoratorB 类");
	}
}
