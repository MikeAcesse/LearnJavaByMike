package com.imooc.uncaughtexception;

/**
 * @author fanzk
 * @version 1.8  描述： 1. 不加try catch抛出4个异常，都带线程名字 2. 加了try catch,期望捕获到第一个线程的异常，线程234不应该运行，希望看到打印出Caught Exception
 * * 3. 执行时发现，根本没有Caught Exception，线程234依然运行并且抛出异常
 * *
 * * 说明线程的异常不能用传统方法捕获
 * @date 2020/7/8 9:04
 */
public class CantCatchDirectly implements Runnable {
    @Override
    public void run() {
//		try {
//			throw new RuntimeException();
//		} catch (RuntimeException e) {
//			//e.printStackTrace();
//			System.out.println(Thread.currentThread().getName()+"Caught Exception.");
//		}


        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            new Thread(new CantCatchDirectly(), "MyThread-1").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "MyThread-2").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "MyThread-3").start();
            Thread.sleep(300);
            new Thread(new CantCatchDirectly(), "MyThread-4").start();
            Thread.sleep(300);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Main Caught Exception");
        }
    }
}
