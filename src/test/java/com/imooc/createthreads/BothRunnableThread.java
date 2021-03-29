package com.imooc.createthreads;

/**
 * @author fanzk
 * @version 1.8    同时使用Runnable 和 Thread 两种实现线程的方式
 * @date 2020/7/8 9:35
 */
public class BothRunnableThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我来自Runnable");
            }
        }) {
            @Override
            public void run() {
                System.out.println("我来自Thread");
            }
        }.start();
    }
}
