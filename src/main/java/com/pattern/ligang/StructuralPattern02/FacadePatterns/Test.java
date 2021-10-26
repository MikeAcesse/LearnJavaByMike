package com.pattern.ligang.StructuralPattern02.FacadePatterns;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/10/22 11:27
 */
public class Test {
	public static void main(String[] args) {
		ServiceA sa = new ServiceAImpl();
		ServiceB sb = new ServiceBImpl();
		sa.methodA();
		sb.methodB();
		System.out.println("===========");
		//facade
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();

		}

}
