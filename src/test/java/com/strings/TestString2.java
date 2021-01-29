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
}
