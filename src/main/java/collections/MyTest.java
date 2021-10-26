package collections;


import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/11/10 9:32
 */
public class MyTest {
	private final List<Person> allPersonList;
	{
		Person p1 = new Person("风清扬",42);
		Person p2 = new Person("孤独求败",66);
		Person p3 = new Person("令狐冲",16);
		Person p4 = new Person("东方不败",25);
		allPersonList = ImmutableList.of(p1,p2,p3,p4);
	}
}
