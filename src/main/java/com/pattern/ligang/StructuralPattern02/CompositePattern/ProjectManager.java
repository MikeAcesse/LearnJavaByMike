package com.pattern.ligang.StructuralPattern02.CompositePattern;

import java.util.ArrayList;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/24 19:19
 */
public class ProjectManager extends Employer {
	public ProjectManager(String name){
		setName(name);
		employers = new ArrayList();
	}
	@Override
	public void add(Employer employer) {
		employers.add(employer);
	}

	@Override
	public void delete(Employer employer) {
       employers.remove(employer);
	}
}
