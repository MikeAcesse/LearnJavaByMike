package com.imooc.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 9:06
 */
public class MyThread5 extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()) {
            n++;
            System.out.println(n + " hello!");
        }
    }
}
