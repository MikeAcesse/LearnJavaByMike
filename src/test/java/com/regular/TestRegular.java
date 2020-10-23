package com.regular;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/19 16:49
 */
public class TestRegular {
	@Test
	public void test1(){
		// 按指定模式在字符串查找
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(\\D*)(\\d+)(.*)";

		// 创建 Pattern 对象
		Pattern r = Pattern.compile(pattern);

		// 现在创建 matcher 对象
		Matcher m = r.matcher(line);
		System.out.println(m.groupCount());
		if (m.find( )) {
			System.out.println("Found value: " + m.group(0) );
			System.out.println("Found value: " + m.group(1) );
			System.out.println("Found value: " + m.group(2) );
			System.out.println("Found value: " + m.group(3) );
		} else {
			System.out.println("NO MATCH");
		}
	}

	@Test
	public void test2(){
		String REGEX = "a*b";
		String INPUT = "aabfooaabfooabfoobkkk";
		String REPLACE = "-";

			Pattern p = Pattern.compile(REGEX);
			// 获取 matcher 对象
			Matcher m = p.matcher(INPUT);
			StringBuffer sb = new StringBuffer();
			while(m.find()){
				m.appendReplacement(sb,REPLACE);
			}
			m.appendTail(sb);
			System.out.println(sb.toString());

	}
}
