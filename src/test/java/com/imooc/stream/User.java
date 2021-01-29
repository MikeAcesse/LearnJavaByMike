package com.imooc.stream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/13 12:24
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

	public String name;
	public int age;
	public User(String name,int age){
		this.name=name;
		this.age=age;
	}
}
