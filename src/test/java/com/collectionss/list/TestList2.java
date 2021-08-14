package com.collectionss.list;

import org.apache.xalan.templates.ElemForEach;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 栈：一些基本类型的变量和对象的引用变量都是在函数的栈内存中分配，但对象本身不存放在栈中，而是存放在堆（new出来的对象）或者常量池中(对象可能在常量池里)（字符串常量对象存放在常量池中。）
 * 堆：存放new 出来的对象。
 * 常量池：存放字符串常量和基本类型常量（public static final）。
 * 对于栈和常量池中的对象可以共享，对于堆中的对象不可以共享！！！
 *
 * @author fanzk
 * @version 1.8
 * @date 2021/7/1 10:16
 */
public class TestList2 {
	@Test
	public void test1(){
		List<String> copyrule = new ArrayList<String>();
		copyrule.add("A");
		copyrule.add("B");
		copyrule.add("C");
		copyrule.add("D");
		System.out.println(copyrule.toString());
		List<String> tempRule;
		tempRule = copyrule;
		copyrule.clear();
		System.out.println(copyrule.toString());
		System.out.println(tempRule.toString());
	}


	@Test
	public void test2(){
		List<String> copyrule = new ArrayList<>();
		copyrule.add("A");
		copyrule.add("B");
		copyrule.add("C");
		copyrule.add("D");
		System.out.println(copyrule.toString());
		List<String> tempRule = new ArrayList<>(copyrule);
		copyrule.clear();
		System.out.println(copyrule.toString());
		System.out.println(tempRule.toString());
	}

	@Test
	public void test3(){
		List<String> copyrule = new ArrayList<>();
		copyrule.add("A");
		copyrule.add("B");
		copyrule.add("C");
		copyrule.add("D");
		System.out.println(copyrule.toString());
		List<String> tempRule = new ArrayList<>();
		tempRule.addAll(copyrule);
		copyrule.clear();
		System.out.println(copyrule.toString());
		System.out.println(tempRule.toString());
	}

	@Test
	public void test4(){
		List<String> copyrule = new ArrayList<>();
		copyrule.add("A");
		copyrule.add("B");
		copyrule.add("C");
		copyrule.add("D");
		System.out.println(copyrule.toString());
		List<String> tempRule = new ArrayList<>();
		for (String x: copyrule
		     ) {
			tempRule.add(x);
		}
		copyrule.clear();
		System.out.println(copyrule.toString());
		System.out.println(tempRule.toString());
	}
}
