package com.pattern.ligang.StructuralPattern02.BridgePattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 14:29
 */
public class Lady extends Person {
	public Lady() {
		setType("女人");
	}

	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}
}
