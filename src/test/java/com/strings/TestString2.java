package com.strings;

import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/11/27 13:41
 */
public class TestString2 {
	@Test
	public void test1(){
		System.out.println("sss\b");
		System.out.println("sss\ba");
	}

	@Test
	public void test2() throws InterruptedException {
		while(true) {
			for(int i = 0; i < 20; i++){
				Thread.sleep(20);
				System.out.print("#"+i);
			}
			for(int i = 0; i < 20; i++){
				Thread.sleep(20);
				System.out.print("\b \b");
			}
			break;
		}

	}

	@Test
	public void test3(){
		String s = String.format("%2d,%3d",123,12);
		System.out.println(s);

	}



	@Test
	public void test4(){
		String baselineStr ="baseline-2021-02-07_11-13-53\\";
		baselineStr =((baselineStr.charAt(baselineStr.length()-1)=='\\') || (baselineStr.charAt(baselineStr.length()-1)=='/'))?
				baselineStr.substring(0,baselineStr.length()-1):baselineStr;
		System.out.println(baselineStr);

	}


	@Test
	public void test5(){
		String str1 = "/root/work/test/mto01/backup/1111/";
		int index = str1.lastIndexOf("/",str1.length()-2);
		String str2 = str1.substring(0,index+1);
		System.out.println(str2);
	}
}
