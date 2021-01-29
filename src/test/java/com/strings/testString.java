package com.strings;

import org.junit.Test;

import java.util.Locale;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/11/17 11:13
 */
public class testString {
	@Test
	public void test1(){
		String str = "fanzhikang";
		Locale locale = Locale.getDefault();
		System.out.println("locale= "+locale);
		String out = str.toLowerCase();
		System.out.println(out);
	}

	@Test
	public void Test2() {
		String Str = new String("WWW.RUNOOB.COM");
		System.out.print("返回值 :" );
		System.out.println( Str.toLowerCase() );
	}


	@Test
	public void Test3() {
		String Str = new String("AA_0.TXT\n" +
				"AA_10.TXT\n" +
				"AA_11.TXT\n" +
				"AA_12.TXT\n" +
				"AA_13.TXT\n" +
				"AA_14.TXT\n" +
				"AA_15.TXT\n" +
				"AA_16.TXT\n" +
				"AA_17.TXT\n" +
				"AA_18.TXT\n" +
				"AA_19.TXT\n" +
				"AA_1.TXT\n" +
				"AA_20.TXT\n" +
				"AA_21.TXT\n" +
				"AA_22.TXT\n" +
				"AA_23.TXT\n" +
				"AA_24.TXT\n" +
				"AA_2.TXT\n" +
				"AA_3.TXT\n" +
				"AA_4.TXT\n" +
				"AA_5.TXT\n" +
				"AA_6.TXT\n" +
				"AA_7.TXT\n" +
				"AA_8.TXT\n" +
				"AA_9.TXT\n" +
				"BB_0.TXT\n" +
				"BB_10.TXT\n" +
				"BB_11.TXT\n" +
				"BB_12.TXT\n" +
				"BB_13.TXT\n" +
				"BB_14.TXT\n" +
				"BB_15.TXT\n" +
				"BB_16.TXT\n" +
				"BB_17.TXT\n" +
				"BB_18.TXT\n" +
				"BB_19.TXT\n" +
				"BB_1.TXT\n" +
				"BB_20.TXT\n" +
				"BB_21.TXT\n" +
				"BB_22.TXT\n" +
				"BB_23.TXT\n" +
				"BB_24.TXT\n" +
				"BB_2.TXT\n" +
				"BB_3.TXT\n" +
				"BB_4.TXT\n" +
				"BB_5.TXT\n" +
				"BB_6.TXT\n" +
				"BB_7.TXT\n" +
				"BB_8.TXT\n" +
				"BB_9.TXT\n");
		System.out.print("返回值 :" );
		System.out.println( Str.toLowerCase() );
	}
}
