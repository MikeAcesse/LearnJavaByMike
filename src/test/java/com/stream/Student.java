package com.stream;

import java.util.Objects;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/12/25 16:35
 */
public class Student {
	private String name;
	private Integer age;
	private Integer score;
	private Status status;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Status getStatus() {
		return status;
	}

	public enum Status {FREE, BUSY, HAPPY}

	public Student() {
	}

	public Student(String name, Integer age, Integer score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public Student(String name, Integer age, Integer score, Status status) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", score=" + score +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		if (name != null ? !name.equals(student.name) : student.name != null) return false;
		if (age != null ? !age.equals(student) : student.age != null) return false;
		return score != null ? score.equals(student.score) : student.score == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (age != null ? age.hashCode() : 0);
		result = 31 * result + (score != null ? score.hashCode() : 0);
		return result;
	}
}
