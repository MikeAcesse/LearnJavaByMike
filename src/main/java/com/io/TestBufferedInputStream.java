package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/20 19:59
 */
public class TestBufferedInputStream {
	public static void main(String[] args) {
		testFileInputStream();
		testBufferedInputStream();
	}

	public static void testFileInputStream(){
		try {
			FileInputStream fis = new FileInputStream("E:\\liaoxuefeng-learn-java-master(2).zip");
			long t = System.currentTimeMillis();
			int c;
			while((c = fis.read())!=-1){

			}
			fis.close();
			t= System.currentTimeMillis() - t;
			System.out.println("遍历文件用了如下时间:" + t);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void testBufferedInputStream(){
		try {
			FileInputStream fis = new FileInputStream("E:\\liaoxuefeng-learn-java-master(2).zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			long t = System.currentTimeMillis();
			int c;
			while((c = fis.read())!=-1){

			}
			fis.close();
			t= System.currentTimeMillis() - t;
			System.out.println("遍历文件用了如下时间:" + t);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
