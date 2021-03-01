package imooclambda;

import com.imooc.IMessageFormat;
import com.imooc.IUserCredential;
import com.imooc.impl.MessageFormatImpl;
import com.imooc.impl.UserCredentialImpl;

import java.util.UUID;
import java.util.function.*;

/**
 * 需求改动：
 * 所有的用户验证，可以同时获取用户的验证信息【是否认证成功|成功~返回用户|null
 * @author fanzk
 * @version 1.8
 * @date 2021/3/1 9:13
 *
 * Lambda 表达式 基本语法
 */
public class App {
	String welcome = "慕课网欢迎您";

	public static void main(String[] args) {
		// 一， 接口的静态方法 和 默认方法
		 // 1. 默认方法
//		IUserCredential ic  = new UserCredentialImpl();
//		System.out.println(ic.verifyUser("admin"));
//		System.out.println(ic.getCredential("admin"));

		//2 .静态方法
//		String msg = "hello world";
//		if(IMessageFormat.verifyMessage(msg)){
//			IMessageFormat format = new MessageFormatImpl();
//			format.format(msg,"json");
//		}

		//匿名内部类，实现接口的抽象方法
//		IUserCredential ic2 = new IUserCredential() {
//			@Override
//			public String verifyUser(String username) {
//				return "admin".equals(username)?"管理员":"会员";
//			}
//		};
//		System.out.println(ic2.verifyUser("admin"));
//		System.out.println(ic2.verifyUser("manager"));

		// 二 lambda 表达式是函数式接口的一种实现
		//lambda 表达式，针对函数式接口的简单实现
//		IUserCredential ic3 = (String username) ->{
//			return "admin".equals(username)?"lbd管理员":"lbd会员";
//		};
//		System.out.println(ic3.verifyUser("manager"));
//		System.out.println(ic3.verifyUser("admin"));
//
//		IUserCredential ic4 = (username) ->"admin".equals(username)?"lbd管理员":"lbd会员";
//		System.out.println(ic4.verifyUser("manager"));
//		System.out.println(ic4.verifyUser("admin"));

		// 三 JDK8 提供常见函数式接口
//		Predicate<String> pre = (String username) ->{
//			return "admin".equals(username);
//		};
//		System.out.println(pre.test("manager"));
//		System.out.println(pre.test("admin"));

//		Consumer<String> con = (String message) ->{
//			System.out.println("要发送的消息： "+message);
//			System.out.println("消息发送完成");
//		};
//		con.accept("hello, 慕课网的学员们...");
//		con.accept("imooc lambda expression");

//		Function<String,Integer> fun = (String gender) ->{
//			return "male".equals(gender)?1:0;
//		};
//		System.out.println(fun.apply("male"));
//		System.out.println(fun.apply("female"));

//		Supplier<String> sup = () -> {
//			return UUID.randomUUID().toString();
//		};
//		System.out.println(sup.get());
//		System.out.println(sup.get());
//		System.out.println(sup.get());

//		UnaryOperator<String> uo = (String img) ->{
//			img += "[100X200]";
//			return img;
//		};
//		System.out.println(uo.apply("原图--"));

//		BinaryOperator<Integer> bo = (Integer i1,Integer i2) ->{
//			//return i1> i2 ?i1:i2;
//			return i1+i2;
//		};
//		System.out.println(bo.apply(12,13));

		/**
		 * java.util.function 提供了大量的函数式接口
		 * Predicate 接收参数T对象，返回一个boolean类型的结果
		 * Consumer 接收参数T对象，没有返回值
		 * Function 接收参数T对象，返回R对象
		 * Supplier 不接收任何参数，直接通过get() 获取执行类型的对象
		 * UnarayOperator 接口参数T对象，执行业务处理后，返回更新后的T对象
		 * BinaryOperator 接口接收两个T对象，执行业务处理后，返回一个T对象
		 */

		 // 1. lambda 表达式的基本语法
		/**
		 * 1) 声明： 就是和lambda表达式绑定的接口类型
		 * 2）参数： 包含在一对圆括号中，和绑定的接口中的抽象方法中的参数个数及顺序一致
		 * 3）操作符： ->
		 * 4) 执行代码块： 包含在一对大括号中，出现在操作符号的右侧
		 *
		 * 【接口声明】 = （参数） -> {执行代码块}；
		 */
//		ILambda1 i1 = () -> {
//			System.out.println("hello imooc!");
//			System.out.println("welcome to imooc!");
//		};
//		i1.test();
//
//		ILambda1 i2 = () -> System.out.println("hello imooc");
//		i2.test();

//		ILambda2 i21 = (String n,int a) ->{
//			System.out.println(n +"say: my year's old is "+a);
//		};
//		i21.test("fanzk",35);
//
//		ILambda2 i22 = (n,a) ->{
//			System.out.println(n + " 说： 我今年"+a+"岁了");
//		};
//		i22.test("tom",22);
//		ILambda3 i3 =(x,y) ->{
//			int z = x+y;
//			return z;
//		};
//		System.out.println(i3.test(11,22));

//		ILambda3 i31 = (x,y) -> x+y;
//		System.out.println(i31.test(100,200));

		/**
		 * 1. lambda表达式，必须和接口进行绑定
		 * 2. lambda表达式的参数，可以附带0个和n 个参数，括号中的参数类型可以不用指定，
		 *    jvm 在运行时，会自动根据绑定的抽象方法中的参数进行推导。
		 * 3. lambda 表达式的返回值，如果代码块只有一行，并且没有大括号，不用写return 关键字，单行代码执行的结果，会自动返回。
		 *   如果添加了大括号，或者有多行代码，必须通过return 关键字返回执行结果。
		 */






	}
	//没有参数，没有返回值的lambda 表达式绑定的接口
	interface ILambda1 {
		void test();
	}
	//带有参数，没有返回值得lambda表达式
	interface ILambda2{
		void test(String name, int age);
	}
	//带有参数，带有返回值的lambda 表达式
	interface ILambda3{
		int test(int x,int y);
	}
}
