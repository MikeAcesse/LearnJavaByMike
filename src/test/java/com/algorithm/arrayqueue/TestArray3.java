package com.algorithm.arrayqueue;

import javax.sound.midi.Soundbank;
import javax.swing.text.StyledEditorKit;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/13 16:00
 */
public class TestArray3 {
	/**
	 * 二维数组的遍历
	 * 1） 普通for 循环
	 * 2） 加强for 循环
	 * 3）普通for循环+加强for循环
	 * @param args
	 */
	public static void main(String[] args) {
       //二维数组
		int[]intA[] = {{1,2},{2,3,4},{3,4,5,6}};
		//(1) 普通for循环
		for(int i=0;i<intA.length;i++){ //0,1,2
			for (int j = 0; j <intA[i].length ; j++) { //每一个一维数组的长度
				System.out.print(intA[i][j]+"\t");
			}
			System.out.println();

		}

		//(2) 加强for循环
		System.out.println("\n================================");
		for(int[] arr:intA){ //int[] 二维数组中元素的类型，arr迭代变量，intA二维数组的名称
			for (int i : arr){ //int 一维数组的类型，i是迭代变量，arr 一维数组的名称
				System.out.print(i+"\t");

			}
			System.out.println();
		}
		//(3)普通与加强for循环的混搭
		System.out.println("\n================================");
		for(int[] arr : intA){//加强for
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n================================");
		for (int i = 0; i <intA.length ; i++) {
			for(int j : intA[i]){
				System.out.print(j+"\t");
			}
			System.out.println();
		}

	}
}
