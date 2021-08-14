package com.imooc.jmm;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author fanzk
 * @version 1.8 volatile适用的情况1
 * @date 2020/7/9 16:27
 */
public class UseVolatile1 implements Runnable {
    volatile boolean done = false;
    AtomicInteger realA = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            setDone();
            realA.incrementAndGet();
        }
    }

    private void setDone() {
        done = true;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable r = new UseVolatile1();
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(((UseVolatile1) r).done);
        System.out.println(((UseVolatile1) r).realA.get());


    }
}
