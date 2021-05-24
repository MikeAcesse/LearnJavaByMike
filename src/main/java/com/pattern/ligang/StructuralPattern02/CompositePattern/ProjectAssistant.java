package com.pattern.ligang.StructuralPattern02.CompositePattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:18
 */
public class ProjectAssistant extends Employer {
	public ProjectAssistant(String name){
		setName(name);
		employers = null; //项目助理，表示没有下属了
	}
	@Override
	public void add(Employer employer) {

	}

	@Override
	public void delete(Employer employer) {

	}
}
