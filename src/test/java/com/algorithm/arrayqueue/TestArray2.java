package com.algorithm.arrayqueue;

import java.sql.SQLOutput;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/13 15:08
 */
public class TestArray2 {

	public static void main(String[] args) {
		//二维数组不是规则的矩阵
		int[]intA[] = {{1,2},{2,3,4},{3,4,5,6}};
		System.out.println(intA); //[[I@3af49f1c 两个【【 表示是二维的， I 表示数组是int 型，@3af49f1c是内存地址
		long[]longb[] = {{1,2},{2,3,4},{3,4,5,6}};
		System.out.println(longb);//[[J@19469ea2

		//声明一个二维数组，用于存储3个一维数组，每一个一维数组存多少个数，不知道，null
		int[][] intB = new int[3][];
		intB[0]= new int[3];
		intB[1]= new int[]{1,2,3,4};
		intB[2] = new int[2];
		System.out.println(intB[1]);
		System.out.println(intB[1][1]);

		//声明一个二维数组，同时创建出一维数组，每个一维数组的长度相同
		// 存储三个一维数组，每个一维数组的长度是4
		int[][] intC= new int[3][4];
		System.out.println(intC);
	}

}
