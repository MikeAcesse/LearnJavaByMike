package com.pattern.ligang.StructuralPattern02.CompositePattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:16
 */
public class Programer extends Employer {
	public Programer(String name){
		setName(name);
		employers = null; // 程序员，表示没有下属了
	}

	@Override
	public void add(Employer employer) {

	}

	@Override
	public void delete(Employer employer) {

	}
}
