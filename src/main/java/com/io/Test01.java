package com.io;

import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/22 13:41
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入字符串：");
		int index = 1;
		while(true){
			String line = scan.nextLine();
			System.out.println("输入的字符串为："+line);
			index++;
			if(index ==10){
				break;
			}

		}
	}
}
