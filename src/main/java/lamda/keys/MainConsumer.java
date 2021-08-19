package lamda.keys;

import java.util.Arrays;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/18 9:12
 * Consumer(消费型)
 * Supplier(供给型)
 * Predicate(判断型)
 * Function(转化型)
 *  Lambda 就是将一段代码赋值给某个变量
 *  ablock=public void dosomethings(String s){
 *             System.out.println(s);
 *        }
 */
public class MainConsumer {
	public static void main(String[] args) {
          List<Integer> list = Arrays.asList(1,2,3,4,5);
          list.stream().forEach(System.out::println);
	}
}
