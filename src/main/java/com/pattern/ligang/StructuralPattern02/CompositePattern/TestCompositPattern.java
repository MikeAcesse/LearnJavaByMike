package com.pattern.ligang.StructuralPattern02.CompositePattern;

import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:21
 */
public class TestCompositPattern {
	public static void main(String[] args) {
		Employer pm = new ProjectManager("项目经理");
		Employer pa = new ProjectAssistant("项目助理");
		Employer program1 = new Programer("程序员1");
		Employer program2 = new Programer("成勋员2");
		pm.add(pa); // 为项目经理添加项目助理
		pm.add(program2); //为项目经理添加程序员
		pm.add(program1); //为项目经理添加程序员

		List<Employer> ems  = pm.getEmployers();
		for (Employer em : ems
		     ) {
			System.out.println(em.getName());
		}
	}
}
