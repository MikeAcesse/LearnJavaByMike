package com.collectionss.list;

import kotlin.ExperimentalStdlibApi;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 16:35
 */
public class TestSet {

	//交集
	@Test
	public void test1(){
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");

		set2.add("c");
		set2.add("d");
		set2.add("e");
		//求交集
		set1.retainAll(set2);
		System.out.println("交集是："+set1);
	}


	//差集
	@Test
	public void test2(){
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
	//	set1.add("d");

		set2.add("c");
		set2.add("d");
		set2.add("e");
		//求差集
		set1.removeAll(set2);
		System.out.println("交集是："+set1);
	}


	//并集
	@Test
	public void test3(){
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");

		set2.add("c");
		set2.add("d");
		set2.add("e");
		//求并集
		set1.addAll(set2);
		System.out.println("交集是："+set1);
	}
}
