package com.strings;

import info2soft.qa.common.util.StringUtil;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/27 9:37
 */
public class TestMain {
	public static String getWinDir(String path) {
		return path.replace("/root", "D:").replace("/", "\\").replace(";","&");
	}

	@Test
	public void test1(){
		String path ="D:/work/test/monitor2/i2-12019-0/other/a1/";
		String p1 = getWinDir(path);
		System.out.println(p1);

	}

	@Test
	public void test2(){
		String path = "C:\\Program Files (x86)\\info2soft\\ctrlcenter\\";
		int index = path.indexOf("ctrl");
		System.out.println(path.substring(0,index-1));
	}


	@Test
	public void test3(){
		String result=" 驱动器 D 中的卷是 data\n" +
				" 卷的序列号是 3C2E-8C27\n" +
				"\n" +
				" D:\\work 的目录\n" +
				"\n" +
				"2020/08/20  10:32               706 MD5.bat\n" +
				"               1 个文件            706 字节\n" +
				"               0 个目录 103,446,732,800 可用字节\n" +
				"\"\"D:\\work\\\"\"\n" +
				"94 e8 85 3e 5f 36 85 42 8b 73 e3 44 8e 99 eb 83\n" +
				"MD5 哈希(文件 D:\\work\\md5.txt):\n" +
				"94 e8 85 3e 5f 36 85 42 8b 73 e3 44 8e 99 eb 83\n" +
				"CertUtil: -hashfile 命令成功完成。";

		Matcher matcher = Pattern.compile("MD5 哈希.*", Pattern.DOTALL).matcher(result);
		if (matcher.find()) {
			String result1 = matcher.group().substring(0, matcher.group().indexOf("CertUtil"));
			System.out.println(result1);
			System.out.println("**********************");
			System.out.println(result1.substring(result1.indexOf("\n")).trim());
		}
	}


	@Test
	public void test4(){
		String str = "Last login: Thu Oct 29 13:26:32 2020 from 172.20.19.61\n" +
				"\n" +
				"Microsoft Windows [版本 6.1.7601]\n" +
				"\n" +
				"版权所有 (c) 2009 Microsoft Corporation。保留所有权利。\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files\\OpenSSH\\home\\Administrator>grep F1D8A264-30B8-262F-530E-B55FCFC7DF5B \"C:\\Program Files (x86)\\info2soft\\node\\log\\*_sysrun_*.log\"|sed -e \"s/.*log://g\" |grep \"Starting mirror\"|awk \"{print $1,$2}\"\n" +
				"2020-10-29 11:34:48\n";
		List<String> strList = StringUtil.grepLine(str,"^\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}$");
		System.out.println(strList);
	}

	@Test
	public void test5(){
		String str ="-rwxr-x---+ 1 Administrators None 0 Oct 29 15:58 a.txt\n" +
				"-rwxr-x---+ 1 Administrators None 0 Oct 29 15:57 b.txt";

		List<String> strList = StringUtil.grepLine(str,".txt");
		System.out.println(strList);
		System.out.println(strList.size());

	}


	@Test
	public void test6(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd-HH:mm:ss");
		String[] dateStr = df.format(new Date().getTime()+60*1000).split("-");
		System.out.println(dateStr);

	}


	@Test
	public void test7(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-M-dd HH:mm:ss");
		String  dateStr = df.format(new Date().getTime()+60*10);
		System.out.println(dateStr);
		dateStr = dateStr.replaceAll("[-:\\s+]","");
		System.out.println(dateStr);
		String dataString = dateStr.substring(0,dateStr.length()-2)+"00";
		System.out.println(dataString);

	}


}
