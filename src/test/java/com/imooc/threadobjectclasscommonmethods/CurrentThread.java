package com.imooc.threadobjectclasscommonmethods;

/**
 * @author fanzk
 * @version 1.8  演示打印main, Thread-0, Thread-1
 * @date 2020/7/3 9:52
 */
public class CurrentThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new CurrentThread().run();
        new Thread(new CurrentThread()).start();
        new Thread(new CurrentThread()).start();
    }
}
