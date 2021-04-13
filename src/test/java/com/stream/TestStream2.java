package com.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/12 14:17
 */
public class TestStream2 {
	@Test
	public void test1(){
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Stream.iterate(1, i -> i+1).limit(list.size()).forEach(i -> {
			String s= list.get(i);
			System.out.println(s);
		});
	}

	@Test
	public void test2(){
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		IntStream.range(0,list.size()).forEach(i ->{
			System.out.println(list.get(i));
		});
	}
	@Test
	public void test3(){
		List<String> strs = Arrays.asList("a", "a", "a", "a", "b");
		boolean aa = strs.stream().anyMatch(str -> str.equals("a"));
		System.out.println(aa);
		boolean bb = strs.stream().allMatch(str -> str.equals("a"));
		System.out.println(bb);
		boolean cc  = strs.stream().noneMatch(str -> str.equals("aa"));
		System.out.println(cc);
		long count = strs.stream().filter(str -> str.equals("a")).count();
		System.out.println(count);
	}


}
