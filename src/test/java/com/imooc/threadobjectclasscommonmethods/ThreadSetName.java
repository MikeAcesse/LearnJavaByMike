package com.imooc.threadobjectclasscommonmethods;

/**
 * @author fanzk
 * @version 1.8   修改线程名字
 * @date 2020/7/7 10:41
 */
public class ThreadSetName {
	public static void main(String[] args) {
		Thread thread = new  Thread();
		thread.start();
		thread.setName("fanzhikang");
		System.out.println(thread.getName());
	}
}
