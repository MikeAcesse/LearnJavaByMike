package com.imooc.stream;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;


/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 16:19
 */
public class TestRegular {
	public static void main(String[] args) {
		String str="可用内存 : 1448MB 总的内存 : 1838MB";
		String[] strValues = str.split(" ");
		System.out.println(str);
		String[] str2 = strValues[2].split("[GMK]B");
		System.out.println(str2);

	}
	@Test
	public void test2(){
		int size =16;
		System.out.println(size >> 2);
		System.out.println(size << 3);
	}
	@Test
	public void test3(){
		List<String> stringList = new LinkedList<>();
		List<String> tempList = new ArrayList<>();
		tempList.add("牛魔王");
		tempList.add("蛟魔王");
		tempList.add("鹏魔王");
		tempList.add("狮驼王");
		tempList.add("猕猴王");
		tempList.add("禺贼王");
		tempList.add("美猴王");
		System.out.println("tempList -> "+tempList);
		List<String> stringList2 = new LinkedList<>(tempList);
		System.out.println(stringList2);
	}

	@Test
	public void test4(){
		String strs="D:\\work\\cdp\\fan/zhi/kang";
		String[] strarrs = strs.split("[\\/\\\\]");
		System.out.println(strarrs);
	}

	@Test
	public void test5() throws ParseException {
//		String strs="从2020-07-01 09:38:22到2020-07-01 09:38:39";
//		String[] strarrs = strs.split("[从|到]");
//		System.out.println(strarrs[1]);
//		System.out.println(strarrs[2]);
//
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date = sdf.parse(strarrs[1]);
//		Date date2 = sdf.parse(strarrs[2]);
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		calendar.add(Calendar.HOUR_OF_DAY,-2);
//		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
//		System.out.println(sdf.format(calendar.getTime()));
//		calendar.setTime(date2);
//		calendar.add(Calendar.HOUR_OF_DAY,2);
//		System.out.println(sdf.format(calendar.getTime()));

		String str ="2020-07-01 11:42:57";
		String[] arrs=str.split("[-|:|\" \"]");
		System.out.println();

	}
	@Test
	public void test6(){
		int a=129;
		int b=128;
		System.out.println("a 和b 与的结果是："+(a&b));

		int c=2;
		System.out.println("a 非的结果是："+(~c));

		System.out.println("a 与 b 异或的结果是："+(a^b));
		System.out.println("a 和b 或的结果是："+(a|b));
	}

	@Test
	public void test7(){
		List<Integer> arrayList= new ArrayList<>();
		arrayList.add(9);
		arrayList.add(8);
		arrayList.add(7);
		arrayList.add(6);
		arrayList.add(5);
		List<Integer> arrayList2= new ArrayList<>();
		arrayList2.add(1);
		arrayList2.add(3);
		arrayList2.add(7);
		arrayList2.add(8);

		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 0; j <arrayList2.size() ; j++) {
				if(arrayList.get(i)==arrayList2.get(j)){
					System.out.println(arrayList.get(i));
				}
			}
		}

	}

	@Test
	public void test8(){
		List<Integer> arrayList= new ArrayList<>();
		arrayList.add(9);
		arrayList.add(8);
		arrayList.add(7);
		arrayList.add(6);
		arrayList.add(5);
		List<Integer> arrayList2= new ArrayList<>();
		arrayList2.add(3);
		arrayList2.add(1);
		arrayList2.add(11);
		arrayList2.add(8);
		for (Integer a: arrayList
		     ) {
			if(arrayList2.contains(a)){
				System.out.println(Integer.toString(a));
			}
		}

	}

	@Test
	public void test9(){
		List<Integer> arrayList= new ArrayList<>();
		arrayList.add(9);
		arrayList.add(8);
		arrayList.add(7);
		arrayList.add(6);
		arrayList.add(5);
		List<Integer> arrayList2= new ArrayList<>();
		arrayList2.add(1);
		arrayList2.add(3);
		arrayList2.add(9);
		arrayList2.add(8);
		List<Integer> interSection = arrayList.stream().filter(item -> arrayList2.contains(item)).collect(toList());
		System.out.println("---------交集-----------");
		interSection.parallelStream().forEach(System.out :: println);

        List<Integer> reduce1 = arrayList.stream().filter(item ->!arrayList2.contains(item)).collect(toList());
		System.out.println("---------差集-----------");
		reduce1.parallelStream().forEach(System.out::println);

		List<Integer> reduce2 = arrayList2.stream().filter(item ->!arrayList.contains(item)).collect(toList());
		System.out.println("---------差集-----------");
		reduce2.parallelStream().forEach(System.out::println);

		List<Integer> listAll  = arrayList.parallelStream().collect(toList());
		List<Integer> listAll2  = arrayList2.parallelStream().collect(toList());
		listAll.addAll(listAll2);
		System.out.println("---并集 listAll---");
		listAll.parallelStream().forEachOrdered(System.out::println);


		List<Integer> listAllDistinct  =listAll.stream().distinct().collect(toList());
		System.out.println("---得到去重并集 listAllDistinct---");
		listAllDistinct.parallelStream().forEachOrdered(System.out :: println);

		System.out.println("---原来的List1---");
		arrayList.parallelStream().forEachOrdered(System.out :: println);
		System.out.println("---原来的List2---");
		arrayList2.parallelStream().forEachOrdered(System.out :: println);






	}
}
