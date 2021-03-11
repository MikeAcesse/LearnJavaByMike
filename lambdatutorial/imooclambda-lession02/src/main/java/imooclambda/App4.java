package imooclambda;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/3/11 9:12
 * 方法重载对于lambda表达式的影响
 */
public class App4 {
	interface Param1 {
		void outInfo(String info);
	}
	interface Param2 {
		void outInfo(String info);
	}
	//定义方法重载
	public void lambdaMethod(Param1 param){
         param.outInfo("hello param1 imooc!");
	}
	public void lambdaMethod(Param2 param){
		param.outInfo("hello param2 imooc");
	}

	public static void main(String[] args) {
		App4 app = new App4();
		app.lambdaMethod(new Param1() {
			@Override
			public void outInfo(String info) {
				System.out.println(info);
			}
		});
		app.lambdaMethod(new Param2() {
			@Override
			public void outInfo(String info) {
				System.out.println("----------");
				System.out.println(info);
			}
		});

		/**
		 * lambda 表达式存在类型检查-> 自动推导lambda表达式的目标类型，
		 * lambdaMethod() -> 方法 ——>重载方法
		 *               ->Param1 函数接口
		 *               ->Param2 函数接口
		 *               调用方法 ->传递lambda表达式  -》自动推导 -> Param1 | Param2
		 *
		 */
//		app.lambdaMethod((String info) ->{
//			System.out.println(info);
//		});
	}
}
