package com.algorithm.arrayqueue;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/13 16:30
 * System 类中的 arraycopy(…)方法：快速，数组大时用此方法。
 */
public class TestArrayCopy5 {
	public static void main(String[] args) {
		int[] arrA = {11, 22, 33, 44};//源数组
		int[] arrB = new int[5];//目标数组

		System.out.println("数组拷贝之前");
		for (int num : arrB) {
			System.out.print(num + "\t");
		}

		//拷贝
		System.arraycopy(arrA, 1, arrB, 0, 2);
		System.out.println("\n数组拷贝之后");
		for (int num : arrB) {
			System.out.print(num + "\t");
		}

	}


}
