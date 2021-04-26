package com.clazz;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/26 9:29
 */
public class ClassLoaderTest {
	public static void main(String[] args) {
		ClassLoader cl = Test.class.getClassLoader(); //sun.misc.Launcher$AppClassLoader@18b4aac2  说明Test.class文件是由AppClassLoader加载的
		System.out.println("ClassLoader is : "+cl.toString());

//		cl = int.class.getClassLoader();
//		System.out.println("ClassLoader is : "+cl.toString());

		cl = String.class.getClassLoader();
		System.out.println("ClassLoader is : "+cl.toString());
	}
}
