package com.imooc.thread;

import com.ctc.wstx.exc.WstxOutputException;
import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/19 11:31
 */
public class TestThread {
    @Test
    public void testThread() {
        System.out.println("main start ...");
        Runnable target;
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("thread run");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("thread end");
            }
        };
        t.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end ...");
    }

    @Test
    public void testThread2() {
        new Thread(() -> {
            System.out.println("start new thread!");
        }).start();
    }

    @Test
    public void testThread3() {
        Thread t = new MyThread();
        t.run();
    }

    @Test
    public void testThread4() throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        t.join(10);
        System.out.println("end");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("hello");
    }
}