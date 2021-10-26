package com.io;

import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/22 13:45
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个boolean值（true\false）");
		System.out.println("输入的boolean值是： "+scan.nextBoolean());
		System.out.println("请输入一个数字：");
		System.out.println("输入的数字是："+scan.nextInt());
		System.out.println("请输入一个字符串");
		System.out.println("输入的字符串是： "+ scan.next());
		System.out.println("请输入一个长整型");
		System.out.println("输入的长整型是： "+scan.nextLong());
	}
}
