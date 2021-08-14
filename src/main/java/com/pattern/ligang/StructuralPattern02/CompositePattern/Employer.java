package com.pattern.ligang.StructuralPattern02.CompositePattern;

import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:12
 */
public abstract class Employer {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public abstract void add(Employer employer);
	public abstract void delete(Employer employer);
	public List<Employer> employers;
	public void printInfo(){
		System.out.println(name);
	}
	public List<Employer> getEmployers(){
		return this.employers;
	}


}
