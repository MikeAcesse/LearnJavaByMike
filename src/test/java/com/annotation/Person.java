package com.annotation;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/10 10:49
 */
@Table("person")
public class Person {
	@Column("firstname")
	private String name;
	@Column("user_name")
	private String userName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
