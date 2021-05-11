package com.collectionss.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 16:35
 */
public class TestList {

	//交集
	@Test
	public void test1(){
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");

		list2.add("c");
		list2.add("d");
		list2.add("e");
		//求交集
		list1.retainAll(list2);
		System.out.println("交集是："+list1);
	}


	//差集
	@Test
	public void test2(){
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");

		list2.add("c");
		list2.add("d");
		list2.add("e");
		//求差集
		list1.removeAll(list2);
		System.out.println("差集是："+list1);
	}


	//并集
	@Test
	public void test3(){
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");

		list2.add("c");
		list2.add("d");
		list2.add("e");
		//求并集
		list1.addAll(list2);
		System.out.println("并集是："+list1);
	}
}
