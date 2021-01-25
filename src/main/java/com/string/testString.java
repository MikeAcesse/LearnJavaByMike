package com.string;

import com.google.common.collect.Lists;
import info2soft.qa.common.util.StringUtil;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/17 11:12
 */
public class testString {
	@Test
	public void test(){
		String str = "最近访问：2020-07-17 10:04:46.198324697";
		String[] timeArray = str.split(" ");
		int dateIndex = timeArray[0].indexOf("：");
		String dateStr = timeArray[0].substring(dateIndex+1).trim();
		StringBuffer sb = new StringBuffer(dateStr);

		System.out.println(sb.append(" ").append(timeArray[1]).toString());
	}

	@Test
	public void test1(){
		String str = "最近访问：2020-07-17 10:04:46.198324697";
		String[] timeArray = str.split(" |：");
		StringBuffer sb = new StringBuffer(timeArray[1]);

		System.out.println(sb.append(" ").append(timeArray[2]).toString());

	}

	@Test
	public void test2(){
		String str = "2020-07-17 13:42:26.33892";
		String[] timeArray = str.split(".");
		System.out.println(timeArray[0]);
	}


	@Test
	public void test3(){
		String str
				= "2020-07-17 13:42:26.33892";
		int index = str.indexOf('.');
		System.out.println(str.substring(0,index));
	}

	@Test
	public void test4(){
		String output = "Windows [版本 6.1.7601]\n" +
				"\n" +
				"版权所有 (c) 2009 Microsoft Corporation。保留所有权利。\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files\\OpenSSH\\home\\Administrator>\"C:\\Program Files (x86)\\info2soft\\node\\bin\\getcdptime.exe\" 0 8283CA56-D386-39AC-2F6E-F89916D612A5 detail 2020-11-30_09-34-07 10\n" +
				"2020-11-30_09-34-07 -2 1606700047.0 backup 1 Baseline\n" +
				"\n" +
				"2020-11-30_09-34-07 0 1606700082.156504 create 1 D:\\work\\test\\monitor2\\i2-7007-0\\aa_0.txt\n" +
				"\n" +
				"2020-11-30_09-34-07 1 1606700082.156504 write 1 D:\\work\\test\\monitor2\\i2-7007-0\\aa_0.txt, off 0, len 1,024\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files\\OpenSSH\\home\\Administrator>";
		List<String> out = getWindowOutput(output);
		System.out.println(out);
	}
	public  List<String> getWindowOutput(String inputText) {
		if (StringUtil.isNotEmpty(inputText)) {
			List<String> afterFiltered = StringUtil.parseLines(inputText);
			Iterator<String> it = afterFiltered.iterator();
			while(it.hasNext()){
				String x = it.next().trim();
				if(x.contains("Last login")|| x.contains("Microsoft")||x.contains("版权所有")
						|| x.contains("C:\\Program Files") || x.contains("D:") || x.contains("Windows") || x.isEmpty()) {
					it.remove();
				}
			}
			return afterFiltered;
		}
		return Collections.EMPTY_LIST;
	}

	@Test
	public void test5(){
		String valueString ="Windows [版本 6.1.7601]\n" +
				"\n" +
				"版权所有 (c) 2009 Microsoft Corporation。保留所有权利。\n" +
				"\n" +
				"\n" +
				"\n" +
				"C:\\Program Files\\OpenSSH\\home\\Administrator>D:  &  cd D:\\work\\test\\monitor2\\i2-7022-0\\  &  attrib . | awk \"{print $1,$2}\" \n" +
				"D:\\work\\test\\monitor2\\i2-7022-0 \n" +
				"\n" +
				"\n" +
				"\n" +
				"D:\\work\\test\\monitor2\\i2-7022-0>";
		Matcher ma = Pattern.compile("attrib.*?:", Pattern.DOTALL).matcher(valueString);
		while(ma.find()){
			System.out.println(ma.group());
		}
	}

	@Test
	public void test6(){
       String str = windowsNode("start");
		System.out.println(str);
		System.out.println("******************************");
		String str1 = windowsNode("stop");
		System.out.println(str1);

		System.out.println("******************************");
		String str2 = windowsNode("restart");
		System.out.println(str2);
	}
	private  String windowsNode(String action) {
		String i2NodeHome="C:\\Program Files\\Java";
		String[] courses = {"I2-Availability", "I2-Collector", "I2-HaDetector", "I2-rpc", "I2-Sdatad", "I2-Slogd", "I2-Srepd"};
		String cmd = "tasklist |grep Smon.exe && taskkill /f /t /im \"Smon.exe\" &";
		if (action.equals("restart") || action.equals("start")) {
			for (String cours : courses) {
				cmd += " net start " + cours + " &";
			}
			cmd += "\""+i2NodeHome+"\\node\\bin\\smon.exe\" start";
		} else if(action.equals("stop")){
			for (String cours : courses) {
				cmd += " net  stop " + cours + " & ";
			}
		}
		return cmd;
	}


	@Test
	public void test5(){
		String str = "\u001B[A\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[C\u001B[K'\n" +
				"2feab27be4c164f1f9e814293431073b";
		String [] strs = str.split("\n");
		List<String> lists = StringUtil.toStringList(strs);
		Iterator<String> iterator = lists.iterator();
		Pattern pattern = Pattern.compile("[0-9a-zA_Z]{32}");
		while (iterator.hasNext()){
			String x = iterator.next().trim();
			if(!pattern.matcher(x).find()){
				//iterator.remove();
				lists.remove(x);
			}
		}
		System.out.println(lists.size());
	}

	@Test
	public void test7(){
		String str ="6.7";
		boolean result = str.contains("6.");
		System.out.println(result);

	}

	@Test
	public void test6(){
		String out ="aa_0.txt,aa_10.txt,aa_11.txt,aa_12.txt,aa_13.txt,aa_14.txt,aa_15.txt,aa_16.txt,aa_17.txt,aa_18.txt,aa_19.txt,aa_1.txt,aa_20.txt,aa_21.txt,aa_22.txt,aa_23.txt,aa_24.txt,aa_25.txt,aa_26.txt,aa_27.txt,aa_28.txt,aa_29.txt,aa_2.txt,aa_30.txt,aa_31.txt,aa_32.txt,aa_33.txt,aa_34.txt,aa_35.txt,aa_36.txt,aa_37.txt,aa_38.txt,aa_39.txt,aa_3.txt,aa_40.txt,aa_41.txt,aa_42.txt,aa_43.txt,aa_44.txt,aa_45.txt,aa_46.txt,aa_47.txt,aa_48.txt,aa_49.txt,aa_4.txt,aa_5.txt,aa_6.txt,aa_7.txt,aa_8.txt,aa_9.txt";
		String[] fileNamesArray = out.split(",");
		Arrays.sort(fileNamesArray);
		out = StringUtil.toPlainText(fileNamesArray,",");
		System.out.println("one: "+out);

		String out1 ="aa_0.txt,aa_1.txt,aa_10.txt,aa_11.txt,aa_12.txt,aa_13.txt,aa_14.txt,aa_15.txt,aa_16.txt,aa_17.txt,aa_18.txt,aa_19.txt,aa_2.txt,aa_20.txt,aa_21.txt,aa_22.txt,aa_23.txt,aa_24.txt,aa_25.txt,aa_26.txt,aa_27.txt,aa_28.txt,aa_29.txt,aa_3.txt,aa_30.txt,aa_31.txt,aa_32.txt,aa_33.txt,aa_34.txt,aa_35.txt,aa_36.txt,aa_37.txt,aa_38.txt,aa_39.txt,aa_4.txt,aa_40.txt,aa_41.txt,aa_42.txt,aa_43.txt,aa_44.txt,aa_45.txt,aa_46.txt,aa_47.txt,aa_48.txt,aa_49.txt,aa_5.txt,aa_6.txt,aa_7.txt,aa_8.txt,aa_9.txt";
		String[] fileNamesArray1 = out.split(",");
		Arrays.sort(fileNamesArray1);
		out1 = StringUtil.toPlainText(fileNamesArray1,",");
		System.out.println("second: "+out1);

		System.out.println(out.equals(out1));
		System.out.println();

	}
}
