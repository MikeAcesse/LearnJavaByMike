package com.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/30 9:24
 */
public class TestStreanApi {
	@Test
	public void testReduce(){
		List<String> stringList = new ArrayList<>();
		stringList.add("fan");
		stringList.add("zhi");
		stringList.add("kang");
		Optional<String> reduced =stringList.stream()
				.sorted()
				 .reduce((s1,s2) ->s1 +"#"+s2);
		reduced.ifPresent(System.out::println);
	}

	@Test
	public void testListStream(){
		List<String> taskList = new ArrayList<>();
		taskList.add("fanzhikang");
		taskList.add("wangtao");
		taskList.add("jiangang");
		System.out.println(taskList);
		taskList.add(1,"zhangbo");
		System.out.println(taskList);
		List<String> subTaskList=new LinkedList<>();
		subTaskList.add("meimei");
		subTaskList.add("gege");
		taskList.addAll(subTaskList);
		System.out.println(taskList);
		taskList.addAll(1,subTaskList);
		System.out.println(taskList);
		boolean result = taskList.stream().anyMatch(name->name.equals("wangtao"));
		System.out.println("result="+result);
		boolean resul2 = taskList.stream().anyMatch(name->name.startsWith("fan"));
		System.out.println("resul2="+resul2);
	}
}
