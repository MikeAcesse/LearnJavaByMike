package com.lanyou;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/30 9:54
 */
public class TestSelect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a){ //表达式
			case 1: //常量
				System.out.println("this is 1");
			case 2:
				System.out.println("this is 2");
			case 3:
				System.out.println("this is a 1 or 2 or 3");
				//break;
			case 4:
			case 5:
			case 6:
				System.out.println("this is a 4 or 5 or 6");
				break;
			default:
				System.out.println("this is default block");

		}
	}

	@Test
	public void test1(){
		String txt = "-rw-r--r-- 1 root root 1024    firstaa_0.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_1.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_2.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_3.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_4.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_5.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_6.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_7.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_8.txt\n" +
				"-rw-r--r-- 1 root root 1024    firstaa_9.txt\n";
		String txt1 = txt.replace("first","");
		System.out.println(txt1);
	}

	@Test
	public void test2(){
		String txt =" AA_0.TXT\n" +
				"AA_1.TXT\n" +
				"AA_2.TXT\n" +
				"AA_3.TXT\n" +
				"AA_4.TXT\n" +
				"AA_5.TXT\n" +
				"AA_6.TXT\n" +
				"AA_7.TXT\n" +
				"AA_8.TXT\n" +
				"AA_9.TXT\n";
		txt = txt.toLowerCase();
		System.out.println(txt);
	}

	@Test
	public void test3(){
		String txt = "-rw-r--r-- 1 root root 1024    aa_0.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_1.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_2.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_3.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_4.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_5.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_6.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_7.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_8.txt\n" +
				"-rw-r--r-- 1 root root 1024    aa_9.txt";
		String txt1 = txt.replace("aa","AA").replace("txt","TXT");
		System.out.println(txt1);
	}

	@Test
	public void test4(){
		String text ="drwxrwxrwx 2 root root     wk1\n" +
				"drwxr-xr-x 2 root root     a1\n" +
				"drwxr-xr-x 3 root root     other";
		text = text.replace("drwxr-xr-x 2 root root     a1\n","");
		System.out.println(text);
	}
}
