package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/11 14:20
 */
public class AnnotaionTest {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
           //新建Student
		  Student student = new Student();
		  //获取Student 的Class 实例
		Class<Student> stu = Student.class;
		//获取somebody() 方法的Method实例
		Method mSomebody = stu.getMethod("somebody", new Class[]{String.class, int.class});
		//执行该方法
		mSomebody.invoke(student,new Object[]{"lily",18});
		iteratorAnnotations(mSomebody);

		Method mEmpty = stu.getMethod("empty");
		mEmpty.invoke(student);

	}

	public static void iteratorAnnotations(Method method){
		//判断somebody() 方法是否包含MyAnnotation注解
		if(method.isAnnotationPresent(MyAnnotation.class)){
			//获取该方法的MyAnnotation注解实例
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			//获取myAnnotation的值，并打印出来
			String[] values = myAnnotation.value();
			for (String str:values
			     ) {
				System.out.printf(str+",");
			}
			System.out.println();

		}
		//获取方法上的所有注解，并打印出来
		Annotation[] annotations =method.getAnnotations();
		for (Annotation annotation: annotations
		     ) {
			System.out.println(annotation);
		}
	}
}
