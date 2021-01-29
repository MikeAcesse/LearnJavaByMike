package com.stream;


import com.google.common.base.Converter;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import org.apache.xpath.operations.Bool;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/12/25 16:20
 */
public class TestStream1 {

	@Test
	public void testCreateStream(){
//		//通过Collection 系列集合提供的stream() 或 parallelStream() 创建流
//		List<String> list = new ArrayList<>();
//		Stream<String> stream = list.stream();
//
//		// 通过Arrays中的静态方法stream（）获取数组流
//		User[] users = new User[]{};
//		Stream<User> stream1 = Arrays.stream(users);
//
//		//通过Stream 类中的静态方法of()创建流
//		Stream<String> stream2 = Stream.of("a","b","c");
//		System.out.println(stream2.toString());

		//迭代
		Stream<Integer> stream3 = Stream.iterate(100,(x) ->x+2);
		stream3.limit(5).forEach(System.out::println);
	}

	@Test
	public void testGetClass(){
		Student student = new Student();
		student.setAge(12);
		student.setName("fanzhikang");
		student.setScore(100);
		Student student1 = new Student("wangtao",20,101, Student.Status.FREE);
		Class clazz =student.getClass();
		System.out.println(clazz);
		System.out.println(clazz.getName());
		System.out.println(student1.getClass().getName());

	}

	@Test
	public void test1(){
		final int num =1;
		//Converter<Integer,String> stringConverter = (from) -> String.valueOf(from + num);
		//stringConverter.convert(2);
	}
	@Test
	public void testPredicate(){
		Predicate<String> predicate = (s) ->s.length()>0;
		boolean result =predicate.test("foo");
		System.out.println(result);
		boolean result1 = predicate.negate().test("");
		System.out.println(result1);
		Predicate<Boolean> nonNull = Objects::nonNull;
		Predicate<Boolean> isNull = Objects::isNull;
		Predicate<String> isEmpty = String::isEmpty;
	}

	@Test
	public void testFunction(){
		Function<String,Integer> toInteger = Integer::valueOf;
	//	Function<String,String> backToString = toInteger.andThen(String::valueOf);
		//backToString.apply("123");
	}
}
