package com.clazz;

import sun.applet.AppletClassLoader;
import sun.misc.Launcher;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 9:15
 */
public class TestClassLoader {
	/**
	 * BootStrapClassLoader ,ExtClassLoader,AppClassLoader实际上是查阅相应的环境属性，
	 * sun.boot.class.path,java.ext.dirs 和 java.class.path，来加载资源文件的。
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(System.getProperty("sun.boot.class.path"));
		System.out.println("++++++++++++++分割线++++++++++++++");
		System.out.println(System.getProperty("java.ext.dirs"));
		System.out.println("++++++++++++++分割线++++++++++++++");
		System.out.println(System.getProperty("java.class.path"));
	}
}
