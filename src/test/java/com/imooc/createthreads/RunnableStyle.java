package com.imooc.createthreads;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/8 9:39
 */
public class RunnableStyle implements Runnable {
    @Override
    public void run() {
        System.out.println("用Runnable 方法实现线程");
    }

    public static void main(String[] args) {
        Runnable target;
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }
}
