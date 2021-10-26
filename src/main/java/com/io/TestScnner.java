package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/22 11:40
 */
public class TestScnner {
	public static void main(String[] args) {
		printBufferedReader();
	}

	private static void printBufferedReader() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一个字符串");
		try {
			System.out.println("读取的字符串为： "+in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
