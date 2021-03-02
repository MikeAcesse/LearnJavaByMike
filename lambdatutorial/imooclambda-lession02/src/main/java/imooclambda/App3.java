package imooclambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/2 10:41
 * <p>lambda表达式类型检查</p>
 */
public class App3 {
	public static void main(String[] args) {
		test(new MyInterface<String, List>() {
			@Override
			public List strategy(String s, List list) {
				list.add(s);
				return list;
			}
		});

		test((x,y) -> {
			y.add(x);
			return y;
		//	x.add(y);
		// return x;
		});

		/**
		 * (x,y)->{..} -->test(param) -->param == MyInterface -->lambda表达式 ->MyInterface类型
		 * 这个就是对于lambda表达式的类型检查，MyInterface 接口就是lambda表达式的目标类型（target typing）
		 *
		 * (x,y)->{..} -->MyInterface.startegy(T t,R r) -->MyInterface<String, List> inter -->
		 *     T == String R==List --> Lambda -->(x,y) == strategy(T r, R r) ->x==T==String y==R==List
		 *     Lambda表达式类型检查
		 */

	}

	public static void test(MyInterface<String, List> inter){
		List<String> list = inter.strategy("hello",new ArrayList());
		System.out.println(list);

	}

}
@FunctionalInterface
interface MyInterface<T,R>{
	R strategy(T t,R r);
}
