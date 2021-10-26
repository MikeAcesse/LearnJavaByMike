package com.pattern.ligang.StructuralPattern02.BridgePattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 14:24
 * ConcreteImplementor
 *
 */
public class Jacket extends Clothing {
	@Override
	public void personDressCloth(Person person) {
		System.out.println(person.getType()+"穿马甲");
	}
}
