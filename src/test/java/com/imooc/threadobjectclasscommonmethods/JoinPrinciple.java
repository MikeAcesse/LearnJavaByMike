package com.imooc.threadobjectclasscommonmethods;

/**
 * @author fanzk
 * @version 1.8   通过讲解join 原理，分析出join 的代理写法
 * @date 2020/7/6 9:15
 */
public class JoinPrinciple {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "执行完毕");
            }
        });
        thread.start();
        System.out.println("开始等待子线程运行完毕");
        thread.join();
        synchronized (thread) {
            thread.wait();
        }
        System.out.println("所有子线程执行完毕");
    }
}
