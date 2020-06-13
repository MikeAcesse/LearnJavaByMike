package com.imooc.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/12 19:03
 */
public class TestStream {
	@Test
	public void testStream1(){
		List<String> taskList = new ArrayList<>();
		taskList.add("fanzhikang");
		taskList.add("wangtao");
		taskList.add("jiangang");
		boolean result = taskList.stream().allMatch(name->!(name.isEmpty()));
		System.out.println(result);
	}
	@Test
	public void testSteam2(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(6);
		System.out.println(list);
		List<Integer> result = list.stream().filter(o->o>5).collect(Collectors.toList());
		System.out.println(result);
		List<String> result1 = list.stream().map(o->String.valueOf(o)).collect(Collectors.toList());
		System.out.println(result1);
		List<Integer> result2=list.stream().sorted().collect(Collectors.toList());
		System.out.println(result2);
		List<Integer> result3= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result3);
	}
	@Test
	public void testStream3(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(3);
		list.add(6);
		list.stream().forEach(o-> System.out.print(o+", "));
		System.out.println();
		list.forEach(o-> System.out.print(o+"-"));
		List<Integer> result1= list.stream().distinct().collect(Collectors.toList());
		System.out.println();
		System.out.println(result1);
	}
	@Test
	public void testStream4(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(8);
		list.add(6);
		Integer sum = list.stream().reduce(0,(i,j) ->i+j);
		System.out.println(sum);
		Integer sum1 = list.stream().reduce(1,(i,j) ->i*j);
		System.out.println(sum1);
	}

	@Test
	public void testSteam10(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(6);
		Map<Integer,String> map =list.stream().collect(Collectors.toMap(Function.identity(),o->String.format("item%s",o)));
		System.out.println(map);
	}

	@Test
	public void testSteam11(){
		List<User> list = new ArrayList<User>();
		list.add(new User("与李", 18));
		list.add(new User("CSDN", 19));
		list.add(new User("han", 20));
		list.add(new User("han", 21));
		Map<String,List<User>> group  =list.stream().collect(Collectors.groupingBy(User::getName));
		System.out.println(group);
	}

	@Test
	public void testSteam12(){
		List<User> list = new ArrayList<User>();
		list.add(new User("与李", 18));
		list.add(new User("CSDN", 19));
		list.add(new User("han", 20));
		list.add(new User("han", 21));
		Map<Boolean,List<User>> partitioning  =list.stream().collect(Collectors.partitioningBy(o->o.getAge()>=20 && o.getAge()<18  ));
		System.out.println(partitioning);
	}
}
