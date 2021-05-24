package com.pattern.ligang.StructuralPattern02.BridgePattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 14:32
 */
public class TestBridgePattern {
	public static void main(String[] args) {
		Person man = new Man();
		Person lady = new Lady();
		Clothing jacket = new Jacket();
		Clothing trouser = new Trouser();
		jacket.personDressCloth(man);
		trouser.personDressCloth(man);
		jacket.personDressCloth(lady);
		trouser.personDressCloth(lady);

	}
}
