package com.utils.characters;

import org.junit.Test;

import java.util.Random;

/**https://www.cnblogs.com/jpfss/p/9772019.html
 * @author fanzk
 * @version 1.8
 * @date 2021/5/14 10:33
 */
public class TestChars {
	@Test
	public void test1(){
       String str = getRandomString(16);
		System.out.println(str.length());
		System.out.println(str);
	}

	public String getRandomString(int length){
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789._-";
		System.out.println(str.length());
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(65);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
}
