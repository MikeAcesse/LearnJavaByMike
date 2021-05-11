package com.collectionss.list;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/11 10:14
 */
public class TestVector {
	@Test
	public void test1(){
		Vector<String> hs = new Vector<String>();
		hs.add("aa");
		hs.add("bb");
		hs.add("aa");
		hs.add("cc");
		hs.add("dd");
		//printSet2(hs);
		printSet1(hs);
	}

	private void printSet1(List hs) {
		Iterator iterator = hs.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

	private void printSet2(Vector<String> hs) {
		Enumeration<String> elements = hs.elements();
		while(elements.hasMoreElements()){
			System.out.println(elements.nextElement());
		}
	}
}
