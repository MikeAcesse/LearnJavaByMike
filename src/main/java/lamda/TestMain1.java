package lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/10/19 9:47
 */
public class TestMain1 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter","anna","mike","xenia");
		System.out.println(names);
//		test1(names);
		test2(names);
		System.out.println(names);
		test3(names);


	}
	public static void test1(List<String> names){
		Collections.sort(names,(String a,String b) ->{return a.compareTo(b);});
		System.out.println(names);
	}

	//对于函数体只有一行代码的，你可以去掉大括号{}以及return关键字，但是你还可以写得更短点：
	public static void test2(List<String> names){
		Collections.sort(names,(a,b) -> a.compareTo(b));
		System.out.println(names);
	}

	public static void test3(List<String> names){
		Collections.sort(names,(String a,String b) -> a.compareTo(b));
		System.out.println(names);
	}
}
