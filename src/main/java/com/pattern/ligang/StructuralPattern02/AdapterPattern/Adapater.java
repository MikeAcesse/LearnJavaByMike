package com.pattern.ligang.StructuralPattern02.AdapterPattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 13:56
 */
public class Adapater implements Target {
	private Adaptee adaptee;

	public Adapater(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void adpteeMethod() {
		adaptee.adapteeMethod();
	}

	@Override
	public void adpterMethod() {
		System.out.println("Adapter method!");
	}
}
