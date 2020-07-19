package com.string;

import org.junit.jupiter.api.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/17 11:12
 */
public class testString {
	@Test
	public void test(){
		String str = "最近访问：2020-07-17 10:04:46.198324697";
		String[] timeArray = str.split(" ");
		int dateIndex = timeArray[0].indexOf("：");
		String dateStr = timeArray[0].substring(dateIndex+1).trim();
		StringBuffer sb = new StringBuffer(dateStr);

		System.out.println(sb.append(" ").append(timeArray[1]).toString());
	}

	@Test
	public void test1(){
		String str = "最近访问：2020-07-17 10:04:46.198324697";
		String[] timeArray = str.split(" |：");
		StringBuffer sb = new StringBuffer(timeArray[1]);

		System.out.println(sb.append(" ").append(timeArray[2]).toString());

	}

	@Test
	public void test2(){
		String str = "2020-07-17 13:42:26.33892";
		String[] timeArray = str.split(".");
		System.out.println(timeArray[0]);
	}


	@Test
	public void test3(){
		String str = "2020-07-17 13:42:26.33892";
		int index = str.indexOf('.');
		System.out.println(str.substring(0,index));
	}
}
