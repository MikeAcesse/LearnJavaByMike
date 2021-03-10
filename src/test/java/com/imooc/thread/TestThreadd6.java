package com.imooc.thread;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 9:22
 */
public class TestThreadd6 {
    public static void main(String[] args) {
        Thread t = new Thread1();
        t.setDaemon(true);
        t.start();
        System.out.println("mian: wait 3 sec...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        System.out.println("main: end.");
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (; ; ) {
            System.out.println("Thread-1: running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }
}
