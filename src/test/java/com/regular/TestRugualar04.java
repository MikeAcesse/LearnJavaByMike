package com.regular;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/2/1 14:03
 */
public class TestRugualar04 {

	@Test
	public void test1() throws IOException {
		BufferedReader in ;
		Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
		in = new BufferedReader(new FileReader("E:\\idea-workspace\\LearnJavaByMike\\resources\\phone.txt"));
		String s;
		while((s = in.readLine()) != null){
			Matcher matcher = pattern.matcher(s);
			if(matcher.find()){
				System.out.println(matcher.group());
			}
		}
		in.close();
	}

	@Test
	public void test2() throws IOException {
		BufferedReader in ;
		Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
		in = new BufferedReader(new FileReader("E:\\idea-workspace\\LearnJavaByMike\\resources\\phone.txt"));
		String s;
		while((s = in.readLine()) != null){
			Matcher matcher = pattern.matcher(s);
			if(matcher.find()){
				System.out.println(matcher.group());
			}
		}
		in.close();
	}


	@Test
	public void test3() throws IOException {
		String str = "java has regex\nJava has regex\nJAVA has pretty good regular expressions\nRegular expressions are in Java";
		Pattern p = Pattern.compile("^java",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println(m.group());
		}
	}

	@Test
	public void testSplitDemo() throws IOException {
		String str = "This!!unusual use!!of exclamation!!points";
		System.out.println(Arrays.asList(Pattern.compile("!!").split(str)));
		System.out.println(Arrays.asList(Pattern.compile("!!").split(str,2)));
		System.out.println(Arrays.asList("Aha! String has a split() built in!".split(" ")));
	}

	@Test
	public void testResetting() throws IOException {
		Matcher m = Pattern.compile("[frb][aiu][gx]")
				.matcher("fix the rug with bags");
		while(m.find()){
			System.out.println(m.group());
			m.reset("fix the rig with rags");
		}
	}
}
