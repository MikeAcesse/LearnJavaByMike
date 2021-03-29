package com.imooc.createthreads;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/8 9:40
 */
public class ThreadStyle extends Thread {
    @Override
    public void run() {
        System.out.println("用Thread 类实现线程");
    }

    public static void main(String[] args) {
        new ThreadStyle().start();
    }
}
