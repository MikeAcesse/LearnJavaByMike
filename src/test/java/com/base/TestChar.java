package com.base;

import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/6/15 10:21
 */
public class TestChar {
	@Test
	public void test(){
		String str = "fanzhikang";
		String str1 = "樊治康";
		String str2 = "1234";
		testCharisNumber(str);
		testCharisNumber(str1);
		testCharisNumber(str2);

	}

	public void testCharisNumber(String str){
		//字符串转char数组
		char[] bigchar = str.toCharArray();

		for (char c : bigchar) {
			//判断char是否为数字
			if (Character.isDigit(c)) {
				System.out.println("数字");
			} else if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
				System.out.println("字母");
			} else {
				  if(isHanZi(c)){
					  System.out.println(c +"是汉字");
				  }
				}
			}
	}

	public static boolean isHanZi(char ch) {
      // 判断是否汉字
		return (ch >= 0x4E00 && ch <= 0x9FA5);
	}
}
