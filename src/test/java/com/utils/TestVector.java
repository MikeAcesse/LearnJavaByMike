package com.utils;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/29 9:57
 */
public class TestVector {

	@Test
	public void test1(){
		Vector<String> hs = new Vector<>();
		hs.add("fan");
		hs.add("zhi");
		hs.add("kang");
		//printSet(hs);
		printSet2(hs);
	}

	public void printSet(List hs){
		Iterator iterator = hs.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	public void printSet2(Vector<String> hs){
		Enumeration<String> elements = hs.elements();
		while (elements.hasMoreElements()){
			System.out.println(elements.nextElement());
		}
	}
}
