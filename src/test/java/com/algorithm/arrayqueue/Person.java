package com.algorithm.arrayqueue;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/13 16:24
 */
public class Person {
	private String name;//姓名
	private int age;//年龄
	private String gender;//性别

	//重写toString以打印想要的输出 否则只会打印对象的内存地址
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+age+"\t"+gender;//
	}

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Person() {
		super();
	}

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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
