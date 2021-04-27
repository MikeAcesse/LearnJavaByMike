package com.utils;

import org.junit.Test;

import java.util.Random;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/27 13:38
 */
public class TestRandom {
	@Test
	public void test(){
		int value = new Random().nextInt();
		System.out.println(value );
	}
}
