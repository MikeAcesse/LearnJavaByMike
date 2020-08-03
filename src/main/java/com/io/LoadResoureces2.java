package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/8/3 10:54
 */
public class LoadResoureces2 {
	public static void main(String[] args) throws IOException {
		 load1();
         load3();
		 load2();


	}
	// 从classpath根目录下加载资源文件
	public static void load1() throws IOException {
		InputStream inputStream =LoadResoureces2.class.getClassLoader().getResourceAsStream("db.properties");
		//InputStream inputStream =Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
		Properties p = new Properties();
		p.load(inputStream);
		System.out.println(p);
		inputStream.close();
	}
	//从访问资源文件的类的字节码同级目录加载资源文件
	public static void load2() throws IOException {
		InputStream inputStream =LoadResoureces2.class.getResourceAsStream("dbio.properties");
		Properties p = new Properties();
		p.load(inputStream);
		System.out.println(p);
		inputStream.close();
	}

	//从资源的绝对路径来加载资源文件
	public static void load3() throws IOException {
		InputStream inputStream = new FileInputStream("E:/idea-workspace/LearnJavaByMike/resources/db1.properties");
		Properties p = new Properties();
		p.load(inputStream);
		System.out.println(p);
		inputStream.close();
	}
}
