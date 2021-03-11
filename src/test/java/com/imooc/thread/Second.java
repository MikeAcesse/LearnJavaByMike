package com.imooc.thread;

public class Second implements Runnable {
    //对象特指实例，这种情况下，synchronize是不起作用的，因为它们锁的是不同的实例
    static Second instance1 = new Second();
    static Second instance2 = new Second();

    @Override
    public void run() {
        method();
    }

    private synchronized void method() {
        System.out.println("我是对象锁的方法修饰符形式。我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public static void main(String[] args) {
        //同一个实例的两个不同线程
        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance2);
        thread1.start();
        thread2.start();
        while (thread1.isAlive() || thread2.isAlive()) {

        }
        System.out.println("Finished");
    }
}
