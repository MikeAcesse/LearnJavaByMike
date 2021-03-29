package com.collectionss;

import collections.Person;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/11/9 9:15
 */
public class TestCollection {
	@Test
	public void testList1(){
		List<String> stus = new ArrayList<>();
		stus.add("zhi");
		stus.add(0,"fan");
		System.out.println(stus.toString());
		List<String> stus1 =Collections.EMPTY_LIST;
		System.out.println(stus1.toString());

		List<String> stus2 = new ArrayList<>();
		System.out.println(stus2.toString());


		List<String> stus3 = Collections.emptyList();
		System.out.println(stus3.toString());
	}

	private final List<Person> allPersonList;
	{
		Person p1 = new Person("风清扬",42);
		Person p2 = new Person("孤独求败",66);
		Person p3 = new Person("令狐冲",16);
		Person p4 = new Person("东方不败",25);
		allPersonList = ImmutableList.of(p1,p2,p3,p4);
	}
	private <T> List<T> filter(List<T> lists, Predicate<T> predicate){
		List<T> result = Lists.newArrayList();
		for (T t: lists
		     ) {
			if(predicate.test(t)){
				result.add(t);
			}
		}
		return result;
	}

	@Test
	public void testPredicate(){
        List<Person> ageGreateThanThirty = filter(allPersonList, p -> p.getAge() >=30);
		System.out.println(ageGreateThanThirty.toString());
		List<Person> ageLessThanTwenty = filter(allPersonList, p -> p.getAge() <20);
		System.out.println(ageLessThanTwenty);
	}
}
