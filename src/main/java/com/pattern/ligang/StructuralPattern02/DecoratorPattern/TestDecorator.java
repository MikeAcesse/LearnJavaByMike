package com.pattern.ligang.StructuralPattern02.DecoratorPattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:33
 */
public class TestDecorator {
	public static void main(String[] args) {
		Man man = new Man();
		ManDecoratorA md1 =new ManDecoratorA();
		ManDecoratorB md2 = new ManDecoratorB();
		md1.setPerson(man);
		md2.setPerson(md1);
		md2.eat();
	}
}
