package com.thread.threadcoreknowledge.createthreads;

/**
 * 描述： 用 Thread 方式实现线程
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
