package com.io;

import info2soft.qa.common.util.StringUtil;
import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/21 11:29
 */
public class TestString {
	@Test
	public void testGetChars(){

		String str = "abcdefgh";
		char[] dest = new char[20];
		str.getChars(1,4,dest,3);
		System.out.println("dest length ->"+dest.length);
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]);
		}

	}


	@Test
	public void testsIADD(){
		int a = 0;
		for (int i = 0; i < 99; i++) {
			a = a++;
		}
		System.out.println(a);
	}

	@Test
	public void testsADDI(){
		int b = 0;
		for (int i = 0; i < 99; i++) {
			b = ++ b;
		}
		System.out.println(b);
	}

	@Test
	public void testsADDI2(){
		Integer a = 0;
		int b = 0;
		for (int i = 0; i < 99; i++) {
			a = a ++;
			b = a ++;
		}
		System.out.println(a);
		System.out.println(b);
	}
}
