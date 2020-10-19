package com.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/22 14:27
 */
public class TestStream {
	@Test
	public void test1(){
		Stream.of("apple","banana","orange","waltermaleon","grape")
				.map(e->e.length())  //转成单词的长度int
				.forEach(e-> System.out.println(e)); //输出
	}
	@Test
	public void test2(){
		Stream.of("apple","banana","orange","waltermaleon","grape")
				.map(String::length)  //转成单词的长度int
				.forEach(System.out::println); //输出
	}

	@Test
	public void test3(){
		Stream.of("apple","banana","orange","waltermaleon","grape")
				.mapToInt(e->e.length()) //转成int
				.forEach(e-> System.out.println(e));

	}

	@Test
	public void test4(){
		Stream.of("apple","banana","orange","waltermaleon","grape")
				.mapToInt(String::length) //转成int
				.forEach(System.out::println);

	}

	@Test
	public void test5(){
		Stream.of("apple","banana","orange","waltermaleon","grape")
				.mapToLong(String::length) //转成long,本质上是int,但是存在类型自动转化
				.forEach(System.out::println);

	}

	@Test
	public void test6(){
		Stream.of("apple","banana","orange","waltermaleon","grape")
				.mapToDouble(String::length) //转成long,本质上是int,但是存在类型自动转化
				.forEach(System.out::println);

	}

	@Test
	public void test7(){
		Stream.of("a-b-c-d","e-f-i-g-h","f-z-k")
				.flatMap(e->Stream.of(e.split("-")))
				.forEach(e-> System.out.println(e));

	}

	@Test
	public void test8(){
		Stream.of(1,2,3,4,5,6,7)
				.limit(3) //限制三个
		.forEach(e-> System.out.println(e));

	}

	@Test
	public void test9(){
		Stream.of(1,2,3,4,5,6,7,0,0,0,0,1,2,3)
				.distinct() //去重
				.forEach(e-> System.out.println(e));

	}

	@Test
	public void test10(){
		Stream.of(1,2,3,4,5,6,7,0,0,0,0,1,2,3)
				.filter(e->e>=5)  //过滤小于5的
				.forEach(e-> System.out.println(e));

	}

	@Test
	public void test11(){
		User w = new User("w",10);
		User x = new User("x",11);
		User y = new User("y",12);
		Stream.of(w,x,y)
				.peek(e->{e.setName(e.getAge()+e.getName());})
				.forEach(e-> System.out.println(e.toString()));

	}

	@Test
	public void test12(){
		Stream.of(1,2,3,4,5,6,7)
				.skip(3)
				.forEach(e-> System.out.println(e));

	}

	@Test
	public void test13(){
		Stream.of(10,9,1,2,0,4,5,6,7)
				.sorted()
				.forEach(e-> System.out.println(e));

	}
	@Test
	public void test14(){
		User w = new User("w",18);
		User x = new User("x",20);
		User y = new User("y",12);
		Stream.of(w,x,y)
				.sorted((e1,e2)->e1.getAge()>e2.getAge()?1:e1.getAge() == e2.getAge()?0:-1)
				.forEach(e-> System.out.println(e.toString()));

	}

	@Test
	public void test15(){
		List<String > nodeList = new ArrayList<>();
		nodeList.add("fa");
		nodeList.add("zhi");
		System.out.println(nodeList.subList(1,2));

	}
}
