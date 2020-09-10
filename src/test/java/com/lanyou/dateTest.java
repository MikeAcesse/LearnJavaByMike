package com.lanyou;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/24 12:11
 */
public class dateTest {
	@Test
	public void test1(){
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH,0);
		System.out.println(cal.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String datestr=sdf.format(cal.getTime());
		System.out.println(datestr);
	//	String combinDate = 2020-07-24 01:28:0


	}

     @Test
	public void  getCurrentDate(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
	     System.out.println(sdf.format(date));
	}

	@Test
	public void testswitch(){
           String str ="/root/work/";
           String[] strArray = str.split(",");
           System.out.println(Arrays.toString(strArray));
	}
	@Test
	public void testswitch1(){
		List<String> list = new ArrayList<>();
		list.add("fa");
		list.add("fa1");
		list.add("fa2");
		list.add("fa3");
		list.add("fa4");
		list.add("fa5");
		System.out.println(list);
	}

	@Test
	public void testswitch2(){
		long a=1;
		int b =1;
		System.out.println(a == b);
		String str ="/root/work/test/monitor3/i2-11587-1-0/";
		int lastindex = str.lastIndexOf("/");
		System.out.println(lastindex);
		int secondIndex = str.lastIndexOf("/",str.length()-2);
		System.out.println(secondIndex);
		System.out.println(str.substring(0,secondIndex+1));



	}
	@Test
	public void testswitch12(){
		String time = "2020-09-09 07:36:41";
		String[] arr = time.split(" ");
		System.out.println(arr);


	}

	@Test
	public  void test01(){
		List<String> list=new ArrayList<>();
		list.add("zzz");
		list.add("aaa");
		list.add("");
		list.add("bbb");
		list.add("bbb");
		list.add("zzz");
		list.add("");
		List<String> filtered=list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		filtered.forEach(System.out::print);
	}
}
