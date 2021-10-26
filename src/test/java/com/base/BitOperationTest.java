package com.base;

import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/20 10:02
 */
public class BitOperationTest {
	@Test
	public void test01(){
		int a = 2 << 3;
		System.out.println("a = "+a);

		int b = 16 >> 3;
		System.out.println("b = "+b);
	}
}
