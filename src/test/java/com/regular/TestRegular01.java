package com.regular;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/11/3 15:55
 */
public class TestRegular01 {
	@Test
	public void test1(){
		String s = "12a干扰\r\n干扰b3";// 想删除ab之间的字符
		System.out.println("s= "+s);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        String replaceAll = s.replaceAll("a.+?b","");
		System.out.println(replaceAll);
		System.out.println("上面没有得到正确的结果是因为.不会匹配换行符");
		String replaceAll2 = s.replaceAll("(?s)a.+?b",""); //在正则表达式行首加上（?s）成单行模式
		System.out.println(replaceAll2);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		//取ab之间的值方式
		Pattern p = Pattern.compile("a.+?b",Pattern.DOTALL);
		Matcher m = p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
