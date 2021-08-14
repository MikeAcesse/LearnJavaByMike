package com.pattern.ligang.StructuralPattern02.BridgePattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 14:21
 * Abstraction
 */
public abstract class Person {
	private Clothing clothing;
	private String type;

	public Clothing getClothing() {
		return clothing;
	}

	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void dress();
}
