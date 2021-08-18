package lamda.keys;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/18 9:58
 */
public class MainPredicate {
	public static void main(String[] args) {
		//要理解一个接口，就实现它的方法
		Predicate<Integer> predicate = i -> i>5;
		System.out.println(predicate.test(1));
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		list.stream().filter(i->i>5).forEach(System.out::print);
	}
}
