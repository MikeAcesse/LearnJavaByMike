package com.io;

import org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/21 10:24
 */
public class TestInt {
	public static void main(String[] args) {
		//test2();
		//test();
		String str = "abcdefghijklmn";
		transform(str);
	}

	/**
	 * char 可以跟int 直接比较
	 */
	public static void test2(){
		String s = "a";
		if(s.charAt(0)==97) {
			System.out.println("a");
		}
		char c='b';
		if(c==98) {
			System.out.println("b");
		}
	}



	public static void test(){
		System.out.println((char)97);//a
		System.out.println('\u0061');//a 61是16进制
		System.out.println((char)39321);//香
		System.out.println('\u9999');//香
		int i = 0X9999;
		System.out.println(i);//39321
	}

	//写一函数把StringReader中输入流中的字符串全部转换成大写，然后将结果写到一个StringWriter中，然后使用这一函数将以字符串全部转成大写。

	public static  void transform (String str) {
		StringReader sr = new StringReader(str);
		StringWriter sw = new StringWriter();
		char[] chars = new char[1024];
		try {
			int len = 0;
			while((len= sr.read(chars)) != -1){
				String strRead = new String(chars,0,len).toUpperCase();
				System.out.println(strRead);
				sw.write(strRead);
				System.out.println("sw： "+sw.toString());
				sw.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			sr.close();
			try {
				sw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
