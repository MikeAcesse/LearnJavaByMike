package com.io;

import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/22 13:36
 */
public class TestBuffered01 {
	public static void main(String[] args) {
		BufferedInputStream in = new BufferedInputStream(System.in);
		System.out.println("请输入一个字符串");
		byte[] b = new byte[1024];
		try {
			in.read(b);
			System.out.println("读取的字段为："+new String(b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
