package com.pattern.ligang.StructuralPattern02.BridgePattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 14:27
 * RefinedAbstraction
 */
public class Man extends Person {
	public Man(){
		setType("男人");
	}
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}
}
