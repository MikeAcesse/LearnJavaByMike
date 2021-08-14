package com.json;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/6/1 15:35
 */
public class TestJson {
	@Test
	public void test1() throws IOException {
		JsonUtil.loadProperties("");
	}

	@Test
	public void testJson(){
		JSONObject object = new JSONObject();
		object.put("string","String");
		object.put("boolean",true);
		List<Integer> integers = Arrays.asList(1,2,3);
		object.put("list",integers);
		//object.put("null",null);
		object.put("int",2);
		System.out.println(object);


	}

	@Test
	public void test2(){
		JSONObject jsonObject = new JSONObject("{\"boolean\":true,\"string\":\"String\",\"list\":[1,2,3],\"int\":2}");
		boolean booealnValue = jsonObject.getBoolean("boolean");
		System.out.println(booealnValue);
		String s = jsonObject.getString("string");
		System.out.println(s);
		int i = jsonObject.getInt("int");
		System.out.println(i);
		List<Object> list = jsonObject.getJSONArray("list").toList();
		System.out.println(list);
		list.forEach(System.out::println);
	}

	/**
	 * 该JSONTokener 类允许应用程序将字符串分解为标记。JSONObject 和JSONArray 构造函数可以使用它来解析JSON 源字符串。
	 * JSONTokener 类的一些重要方法是back() -将光标向后移动一个位置，more() -如果令牌具有元素，则返回true，否则返回false，
	 * next()  -返回当前位置旁边的字符，nextTo(character) -返回一个字符串，直到给定字符匹配为止。
	 */
	@Test
	public void testJSONTokenerTest(){
		String jsonStr = "{\"Technology\":\"java\",\"location\":[Madhapur,Hyderabad]}";
		JSONTokener jsonTokener = new JSONTokener(jsonStr);
		jsonTokener.next();
		jsonTokener.next();
		char c = jsonTokener.next();
		System.out.println("next character: "+c);
		jsonTokener.back();
		char b = jsonTokener.next();
		System.out.println("back: "+b);
		boolean bb = jsonTokener.more();
		System.out.println("bb = "+bb);
		String s = jsonTokener.nextTo('i');
		System.out.println("next to i : "+s);
		System.out.println(jsonStr.toString());



	}
}
