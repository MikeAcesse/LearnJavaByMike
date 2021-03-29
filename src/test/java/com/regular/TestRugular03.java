package com.regular;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/1/28 11:25
 */
public class TestRugular03 {
	@Test
	public void test1(){
		//去除单词与 , 和 . 之间的空格
		String Str = "Hello , World .";
		String pattern = "(\\w)(\\s+)([.,])";
		System.out.println(Str.replaceAll(pattern,"$1$3"));
	}

	@Test
	public void test2(){
		String Str = "fan.pngimg.jpg";
		//分组且创建反向引用
		Pattern  pattern = Pattern.compile("(jpg|png)");
		Matcher matcher = pattern.matcher(Str);
		while(matcher.find()){
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
		}
	}

	@Test
	public void test3(){
		String Str = "fan.pngimg.jpg";
		// 分组但不创建反向引用
		Pattern  pattern = Pattern.compile("(?:jpg|png)");
		Matcher matcher = pattern.matcher(Str);
		while(matcher.find()){
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
		}
	}



	@Test
	public void test4(){
		String Str = "@wxj 你好啊";
		Pattern  pattern = Pattern.compile("@(?<first>\\w+)(\\s)"); //保存一个副本
		Matcher matcher = pattern.matcher(Str);
		while(matcher.find()){
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group("first"));
		}
	}


	@Test
	public void test5(){
		String Str = "@wxj@456@123@789 你好啊";
		Pattern  pattern = Pattern.compile("(@(?![123]))"); //保存一个副本
		Matcher matcher = pattern.matcher(Str);
		while(matcher.find()){
			//System.out.println(matcher.group());
			System.out.println(matcher.group(1));
		}
	}



	@Test
	public void test6(){
		String str = "<div>文章标题</div><div>发布时间</div>";
		//贪婪模式
		Pattern  pattern = Pattern.compile("<div>(?<title>.+)</div>");
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()){
			System.out.println(matcher.group("title"));
		}
		System.out.println("--------------------------");
		//非贪婪模式
		pattern = Pattern.compile("<div>(?<title>.+?)</div>");
		matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group("title"));
		}
	}

	@Test
	public void test7(){
		String str = "<img  src='aaa.jpg' /><img src=bbb.png/><img src=\"ccc.png\"/>" +
				"<img src='ddd.exe'/><img src='eee.jpn'/>";
		// 这里我们考虑了一些不规范的 img 标签写法，比如：空格、引号
		Pattern pattern = Pattern.compile("<img\\s+src=(?:['\"])?(?<src>\\w+.(jpg|png))(?:['\"])?\\s*/>");
		Matcher  matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group("src"));
		}
	}

	@Test
	public void test8(){
		String str = "1990\n2010\n2015\n2017";
		// 这里应用了 (?m) 的多行匹配模式，只为方便我们测试输出
		// "^1990$|^199[1-9]$|^20[0-1][0-6]$|^2017$" 为判断 1990-2017 正确的正则表达式
		Pattern pattern = Pattern.compile("(?m)^1990$|^199[1-9]$|^20[0-1][0-6]$|^2017$");
		Matcher  matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	@Test
	public void test9(){
		String str = "閑人到人间，寒窑赋 - 黄河边";
		Pattern pattern = Pattern.compile("[\\u4e00-\\u9fa5]+");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}



}
