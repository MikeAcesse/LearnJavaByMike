package com.annotation;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/11 14:12
 */

public class Student {

	@Deprecated
	@MyAnnotation
	public void empty(){
		System.out.println("\nempty");
	}

	@Deprecated
	@MyAnnotation(value={"girl","boy"})
	public void somebody(String name,int age){
		System.out.println("\nsomebody: "+name+", "+age);
	}
}
