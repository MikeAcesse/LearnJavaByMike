package com.algorithm.arrayqueue;

import algorithm.arrayqueue.Array;
import org.junit.Before;
import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/2/8 17:34
 */
public class TestArray {
	Array arr;
	@Before
	public void setUp() throws Exception {
		System.out.println("*******setUP************");
		arr = new Array(20);
	}



	@Test
	public void testAdd(){
		for(int i = 0 ; i < 10 ; i ++)
			arr.addLast(i);
		System.out.println(arr);

		System.out.println(arr);

		arr.addFirst(-1);
		System.out.println(arr);
		// [-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		arr.remove(2);
		System.out.println(arr);

		arr.removeElement(4);
		System.out.println(arr);

		arr.removeFirst();
		System.out.println(arr);

	}
}
