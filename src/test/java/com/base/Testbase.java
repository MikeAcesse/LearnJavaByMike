package com.base;

import org.junit.Test;

import java.text.DecimalFormat;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/29 11:30
 */
public class Testbase {
	@Test
	public void test1(){
		double x = 12.34;
		System.out.println((int)x);
		double y = 12.78;
		System.out.println((int)y);
		int z = Integer.parseInt(new java.text.DecimalFormat("0").format(y));
		int z1 = Integer.parseInt(new DecimalFormat("0").format(x));
		System.out.println(z1);
		System.out.println(z);

	}

	@Test
	public void test2(){
		String douNum ="11.00" ;
		int intNum = Double.valueOf(douNum).intValue();
		System.out.println(intNum);
	}

	@Test
	public void test3(){
		//getI2upVersion
		String version ="7.1.68.20092800";
		String[] subversions = version.split("\\.");
		System.out.println(subversions);
	}
}
