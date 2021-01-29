package com.util;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/8/11 17:54
 */
public class TestRuntime {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime);
		System.out.println(runtime.availableProcessors());
		System.out.println("freeMemory: "+runtime.freeMemory());
		System.out.println("totalMemory: "+runtime.totalMemory());

	}

}
