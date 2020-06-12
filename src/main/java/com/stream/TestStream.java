package com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/12 18:39
 */
public class TestStream {
	public static void main(String[] args) {
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
		boolean result = taskList.stream().anyMatch(name->name.equals("ddd"));


	}
}
