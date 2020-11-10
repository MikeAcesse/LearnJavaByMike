package com.collectionss;

import collections.Person;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/11/10 10:20
 */
public class TestTransmitCode {
	@Test
	public void java8Test(){
		Person p1 = new Person("风清扬",42);
		Person p2 = new Person("孤独求败",66);
		Person p3 = new Person("令狐冲",16);
		Person p4 = new Person("东方不败",25);
		List<Person> list = Lists.newArrayList(p1,p2,p3,p4);
		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				//两个数判断大小不要直接相减，如果减一个负数得到的值可能会超出范围，从而返回负数
				//return Ints.compare(o1.getAge(),o2.getAge());
				return  o1.getAge()<o2.getAge()?-1:(o1.getAge()>o2.getAge()?1:0);
			}
		});
		System.out.println(list);

	}

	//传递代码（lambda 表达式）
	@Test
	public void java8Test1(){
		Person p1 = new Person("风清扬",42);
		Person p2 = new Person("孤独求败",66);
		Person p3 = new Person("令狐冲",16);
		Person p4 = new Person("东方不败",25);
		List<Person> list = Lists.newArrayList(p1,p2,p3,p4);
		Collections.sort(list, (Person person1,Person person2) -> {
			return Ints.compare(person1.getAge(),person2.getAge());
		});
		System.out.println(list);

	}

	//传递代码（lambda 表达式）
	@Test
	public void java8Test2(){
		Person p1 = new Person("风清扬",42);
		Person p2 = new Person("孤独求败",66);
		Person p3 = new Person("令狐冲",16);
		Person p4 = new Person("东方不败",25);
		List<Person> list = Lists.newArrayList(p1,p2,p3,p4);
		Collections.sort(list, (Person person1,Person person2) -> Ints.compare(person1.getAge(),person2.getAge()));
		System.out.println(list);

	}

	//传递代码（lambda 表达式）
	@Test
	public void java8Test3(){
		Person p1 = new Person("风清扬",42);
		Person p2 = new Person("孤独求败",66);
		Person p3 = new Person("令狐冲",16);
		Person p4 = new Person("东方不败",25);
		List<Person> list = Lists.newArrayList(p1,p2,p3,p4);
		Collections.sort(list, Comparator.comparing(Person::getAge));
		System.out.println(list);
		Collections.sort(list, Comparator.comparing(Person::getAge).reversed());
		System.out.println(list);

	}
}
