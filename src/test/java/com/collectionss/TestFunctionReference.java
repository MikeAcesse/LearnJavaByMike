package com.collectionss;

import collections.Calculation;
import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/11/10 9:58
 */
public class TestFunctionReference {
	//方法引用

	/**
	 * 把方法传给了一个对象，方法引用看起来更简洁，因为Integer::sum这个方法的具体代码就是接受两个int值，返回一个int值。
	 *
	 * 和colculate方法的入参和返回值是一样的，所以这里是可以传递这个方法进去的。
	 *
	 * 下面介绍java8支持的函数引用：
	 *
	 * 首先就是上述使用的Integer::sum，类名+双冒号+静态方法，还有对象+双冒号+实例方法，还有类名+双冒号+new
	 */
	@Test
	public void test3(){
		Calculation<Integer> calculation = Integer::sum;
		Integer result = calculation.calculate(1,2);
		System.out.println(result);
	}

	//lambda 表达式

	/**
	 * 把方法传给了一个对象，，因为Integer::sum这个方法的具体代码就是接受两个int值，返回一个int值。
	 *
	 */
	@Test
	public void test2(){
       Calculation<Integer> calculation = (num1,num2) -> num1 + num2;
       Integer result = calculation.calculate(4,5);
		System.out.println(result);
	}

	//匿名内部类
	@Test
	public void test1(){
		Calculation<Integer> calculation = new Calculation<Integer>() {
			@Override
			public Integer calculate(Integer t1, Integer t2) {
				return t1+t2;
			}
		};
		Integer result = calculation.calculate(1,2);
		System.out.println(result);
	}
}
