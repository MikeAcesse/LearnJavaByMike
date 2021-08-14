package com.pattern.ligang.StructuralPattern02.AdapterPattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 13:58
 * 适配器模式：将一个类的接口转成客户希望的另外一个接口，Adapter模式使得原本由于接口不兼容而不能一起工作的哪些类可以一起工作
 *
 *
 *
 *
 */
public class TestAdpater {
	public static void main(String[] args) {
		Target target = new Adapater(new Adaptee());
		target.adpteeMethod();
		target.adpterMethod();
	}
}
