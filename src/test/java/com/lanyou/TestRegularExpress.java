package com.lanyou;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/17 11:05
 */
public class TestRegularExpress {
	@Test
	public void test1(){
		String str="（1）错误  [wk] ACK, err -3524\n" +
				"（2）错误 E [wk] mirror errno = -3523\n" +
				"（3）Update Error, code: 3584\n" +
				"（4）错误  [bk] ACK: peer 119, msg 9, code -3524\n" +
				"（5）Update Error, code: -3319\n" +
				"（6）[bk] CDP Merge done, -1005209872\n" +
				"（7）错误 [bk] Recover return -3570\n" +
				"（8）ACK: peer 81, msg 6, code -3\n" +
				"（9）OpenNewDB rv:-3580, destroy snap\n" +
				"（10）Write JNL failed, err -112\n" +
				"           ACK:-112, type 9, peer 13";

		BufferedReader reader = new BufferedReader(new StringReader(str));
		Pattern p = Pattern.compile("(err.*)|(Error.{2}code:.-\\d+)");
		List<String> ret = new ArrayList<>();
		String line = null;
		try{
			while ((line = reader.readLine()) !=null)
			{
				Matcher m = p.matcher(line);
				if(m.find()){
					System.out.println(m.groupCount());
					System.out.println(m.group());
					ret.add(line);
				}
			}
		}catch (IOException e){
			Collections.emptyList();
		}
		System.out.println(ret.toString());

	}

	@Test
	public void test2(){
	String[] ruleNames=new String[]{"task-cr2-i2-13838-12","task-cr2-i2-13838-11","task-cr2-i2-13838-10","task-cr2-i2-13838-9","task-cr2-i2-13838-8","task-cr2-i2-13838-7",
			"task-cr2-i2-13838-6","task-cr2-i2-13838-5","task-cr2-i2-13838-4","task-cr2-i2-13838-3","task-cr2-i2-13838-2","task-cr2-i2-13838-1","task-cr2-i2-13838-0"};
	    //ruleNames = reverse(ruleNames);
//	    ruleNames = reverse1(ruleNames);
	  reverse2(ruleNames);
		for (String rule: ruleNames
		     ) {
			System.out.println(rule);
		}
	}

	// 借助新的数组，把源数组从头到尾，放到新数组的从尾到头的位置
	public String[] reverse(String[] array){
		String[] strs = new String[array.length];
		for (int i = array.length-1; i >=0 ; i--) {
			strs[array.length-i-1] = array[i];
		}
		return strs;
	}
	// 借助新的数组，把源数组从尾到头，放到新数组的从头到尾的位置
	public String[] reverse1(String[] array){
		String[] strs = new String[array.length];
		for (int i = 0; i <array.length ; i++) {
			strs[i] = array[array.length-i-1];
		}
		return strs;
	}

	public void reverse2(String[] array){
		for (int i = 0; i <array.length/2 ; i++) {
			String temp = array[array.length-i-1];
			array[array.length-i-1] = array[i];
			array[i] = temp;
		}
	}

	@Test
	public void test3(){
		int b=5;
		int a = b/2;
		float c = b/2;
		double d = b/2;
		long e = b/2;
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
