package com.imooc.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
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
		List<Integer> result = list.stream().filter(o->o>5).collect(Collectors.toList());
		System.out.println(result);
	}
}
