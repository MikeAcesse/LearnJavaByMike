package com.stream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/22 14:54
 */
public class User {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{ name= "+name+",age= "+age+"}";
	}

	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
