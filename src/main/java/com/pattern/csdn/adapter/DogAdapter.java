package com.pattern.csdn.adapter;

/**
 *    在适配器模式中，我们可以定义一个包装类，包装不兼容接口的对象，
 *    这个包装类就是适配器，它所包装的对象就是适配者。
 *   Target：目标抽象类
 *   Adapter：适配器类
 *   Adaptee：适配者类
 *    Client：客户类
 *
 *
 * @author fanzk
 * @version 1.8
 * @date 2021/8/13 11:01
 */
public class DogAdapter implements Robot {
	Dog dog;
	public DogAdapter(Dog dog){
		this.dog = dog; //取得要适配的对象的引用
	}

	/**
	 * 实现接口中的方法，只需要在相应的方法间进行转换即可完成
	 */
	@Override
	public void cry() {
		System.out.println("机器人模拟狗叫。。。");
		dog.wang();
	}

	@Override
	public void move() {
		System.out.println("机器人模拟狗跑。。。");
		dog.run();

	}
}
