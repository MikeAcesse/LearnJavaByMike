package com.imooc.thread;

import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/19 15:52
 */
public class TestThread4 {

    @Test
    public void test() throws InterruptedException {
        HelloThread2 t = new HelloThread2();
        t.start();
        Thread.sleep(1);
        t.running = false;
    }
}

class HelloThread2 extends Thread {
    public volatile boolean running = true;

    @Override
    public void run() {
        int n = 0;
        while (running) {
            n++;
            System.out.println(n + " hello!");
        }
        System.out.println("end");
    }
}
