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

	private String name;
	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	private int num1;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	private int num2;
	private int num3;

	public User(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	@Override
	public String toString() {
		return "User{" +
				"num1=" + num1 +
				", num2=" + num2 +
				", num3=" + num3 +
				'}';
	}

	public User() {
	}
}
