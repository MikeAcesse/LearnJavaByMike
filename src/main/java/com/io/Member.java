package com.io;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/21 20:05
 */
public class Member {
	private String name;
	private int age;
	public Member() {
	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
