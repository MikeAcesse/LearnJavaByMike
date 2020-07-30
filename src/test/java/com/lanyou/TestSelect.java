package com.lanyou;

import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/30 9:54
 */
public class TestSelect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a){ //表达式
			case 1: //常量
				System.out.println("this is 1");
			case 2:
				System.out.println("this is 2");
			case 3:
				System.out.println("this is a 1 or 2 or 3");
				//break;
			case 4:
			case 5:
			case 6:
				System.out.println("this is a 4 or 5 or 6");
				break;
			default:
				System.out.println("this is default block");

		}
	}
}
