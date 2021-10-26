package com.io;

import org.junit.Test;

import java.nio.CharBuffer;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/21 17:14
 */
public class TestCharSequence {

	@Test
	public void testCharSeques(){
		String str = "hello world ";
		StringBuffer sb = new StringBuffer("hello world");
		StringBuilder sd = new StringBuilder("hello world");
		CharBuffer cb = CharBuffer.wrap("fanzhikang world");
		CharSequence str1 = cb;
		char charAt = str1.charAt(3);
		System.out.println(charAt);
		CharSequence sub = str1.subSequence(2,5);
		System.out.println(sub);

	}
}
