package com.pattern.ligang.StructuralPattern02.FacadePatterns;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:48
 */
public class Facade {
	ServiceA sa;
	ServiceB sb;
	ServiceC sc;

	public Facade(){
		sa = new ServiceAImpl();
		sb = new ServiceBImpl();
		sc = new ServiceCImpl();
	}

	public void methodA() {
		sa.methodA();
		sb.methodB();
	}

	public void methodB() {
		sb.methodB();
		sc.methodC();
	}

	public void methodC() {
		sc.methodC();
		sa.methodA();
	}


}
