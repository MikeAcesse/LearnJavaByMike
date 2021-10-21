package com.regular;

import info2soft.qa.common.util.StringUtil;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static info2soft.qa.common.util.StringUtil.grepLine;

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

	@Test
	public void getWinMd5() {
		String result="";
		Matcher matcher = Pattern.compile("MD5 哈希.*", Pattern.DOTALL).matcher(result);
		if (matcher.find()) {
			result = matcher.group().substring(0, matcher.group().indexOf("CertUtil"));
			result.substring(result.indexOf("\n")).trim();
		}

	}

	@Test
	public void test12() {
		String input ="a\nb\nb\nb";
		//Pattern p1 = Pattern.compile("^.*b.*$");
		Pattern p1 = Pattern.compile("^.*b.*$",Pattern.MULTILINE);
		Matcher m =p1.matcher(input);
		if(m.find()){
			System.out.println(m.group());

		}else{
			System.out.println("无法找到");
		}
	}
	@Test
	public void test13() {
		String input ="100 个文件     10,240,000 字节\n" +
				"  2 个目录 102,443,122,688 可用字节";
		String[] strs= input.split("\n")[0].split("\\s+");
		System.out.println(Arrays.toString(strs));
		System.out.println(strs.length);
		System.out.println(strs[2]);
	}
	@Test
	public void test14() {
		String input ="Last login: Fri Oct 30 16:54:46 2020 from 172.20.19.61\n" +
				"\n" +
				"Microsoft Windows [版本 6.1.7601]\n" +
				"\n" +
				"版权所有 (c) 2009 Microsoft Corporation。保留所有权利。\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files\\OpenSSH\\home\\Administrator>dir D:\\work\\test\\monitor\\44444\\ |grep .txt|awk \"{print$1}\"\n" +


				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"2020/10/30\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files\\OpenSSH\\home\\Administrator>";
		List<String> datelines = StringUtil.grepLine(input,"\\d{4}/\\d{2}/\\d{2}");
		System.out.println(datelines);
		System.out.println(datelines.size());

	}


	@Test
	public void test15() {
		String input ="100 个文件     10,240,000 字节\n" +
				"  2 个目录 102,443,122,688 可用字节";
		List<String> datalines = StringUtil.grepLine(input,"个文件.*");
		String[] strs= datalines.get(0).split("\\s+");
		System.out.println(Arrays.toString(strs));
		System.out.println(strs.length);
		System.out.println(strs[2]);
	}
	@Test
	public void test16(){
		String input="Last login: Sat Oct 31 14:47:25 2020 from 172.20.19.61\n" +
				"\n" +
				"Microsoft Windows [版本 6.1.7601]\n" +
				"\n" +
				"版权所有 (c) 2009 Microsoft Corporation。保留所有权利。\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files\\OpenSSH\\home\\Administrator>cd /d \"C:\\Program Files (x86)\\info2soft\\node\\bin\" & getcdptime 0 8EA4FB99-0529-B169-07E0-5B5FBFD6C714 detail 2020-10-31_14-46-26 10\n" +
				"2020-10-31_14-46-26 -2 1604126786.0 backup 1 Baseline\n" +
				"\n" +
				"2020-10-31_14-46-26 0 1604126803.284605 create 1 D:\\work\\test\\monitor2\\i2-7007-0\\aa_0.txt\n" +
				"\n" +
				"2020-10-31_14-46-26 1 1604126803.284605 write 1 D:\\work\\test\\monitor2\\i2-7007-0\\aa_0.txt, off 0, len 1,024\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files (x86)\\info2soft\\node\\bin>";




		String[] lines = input.split("\r+\n");
		System.out.println(Arrays.asList(lines).toString());
		List<String> afterFiltered = Arrays.stream(lines).filter(str -> !str.isEmpty()).collect(Collectors.toList());
		System.out.println(afterFiltered);

		Iterator<String> it = afterFiltered.iterator();
		while(it.hasNext()){
			String x = it.next();
			if(x.contains("Last login")|| x.contains("Microsoft")||x.contains("版权所有")
			    || x.contains("C:\\Program Files")){
				it.remove();
			}

		}
		System.out.println("**********************");
		System.out.println("afterfiled: "+afterFiltered.toString());
		String dataString = StringUtil.toPlainText(afterFiltered,"\n");
		String[] datas= dataString.split("\n");
		System.out.println(Arrays.asList(datas));


	}


	@Test
	public void testreplace(){
		String home = false? "c:\\progream":"/var/i2data";
		String fullFileName =home+(false?"\\data\\wwwroot\\default\\logs\\":"/data/wwwroot/default/logs/");
		fullFileName = true ?fullFileName.replace("wwwroot","www").replace("data",""):fullFileName;
		System.out.println(fullFileName);
	}

	@Test
	public void testMatch(){
		String text = "遍历：123/888";
		String text2 = text.replaceAll("遍历：","");
		System.out.println(text2.trim());

	}

	@Test
	public void testMatch2(){
		String text = "遍历 : 2018 / 77123";
		Pattern pattern = Pattern.compile("遍历\\s:\\s(\\d+)\\s/\\s(\\d+)");
		Matcher m = pattern.matcher(text);
		int num = m.groupCount();
		System.out.println(num);
		if(m.find()){
			System.out.println(m.group());
			String text2 = m.group(2);
			System.out.println("text2= "+text2);

		}

	}

	@Test
	public void testNumber(){
		String num = "40160819200";
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		System.out.println(max);
		System.out.println(min);
		//int Num = Integer.valueOf(num);
		//System.out.println(Num);
		long lonNum = Long.valueOf(num);
		System.out.println(lonNum);
	}

}
