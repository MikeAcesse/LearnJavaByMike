package com.imooc.thread;

import com.sun.deploy.net.proxy.ProxyUnavailableException;
import org.junit.Test;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 9:05
 */
public class TestThread5 {

    @Test
    public void test1() throws InterruptedException {
        Thread t = new MyThread5();
        t.start();
        Thread.sleep(1);
        t.interrupt();
        t.join();
        System.out.println("end");
    }

    @Test
    public void test2() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }

            }
        }).start();
    }
}
