package com.imooc.createthreads.wrongways;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author fanzk
 * @version 1.8 线程池创建线程的方法
 * @date 2020/7/8 10:08
 */
public class ThreadPool5 {
    public static void main(String[] args) {
        ThreadFactory threadFactory;
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(new Task() {
            });
        }
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}