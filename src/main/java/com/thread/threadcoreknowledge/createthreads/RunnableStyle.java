package com.thread.threadcoreknowledge.createthreads;

public class RunnableStyle implements Runnable {
    @Override
    public void run() {
        System.out.println("用Runnable 方法实现线程");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }
}
