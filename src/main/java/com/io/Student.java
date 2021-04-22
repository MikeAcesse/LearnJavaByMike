package com.io;

import java.io.Serializable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/21 19:57
 */
public class Student implements Serializable {
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
