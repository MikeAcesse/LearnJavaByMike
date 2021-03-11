package com.imooc.threadobjectclasscommonmethods;

/**
 * @author fanzk
 * @version 1.8   演示join期间被中断的效果
 * @date 2020/7/6 9:04
 */
public class JoinInterrupt {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    mainThread.interrupt();
                    Thread.sleep(5000);
                    System.out.println("Thread1 finished");
                } catch (InterruptedException e) {
                    System.out.println("子线程中断");
                }
            }
        });
        thread1.start();
        System.out.println("等待子线程运行完毕");
        try {
            thread1.join();
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + "主线程中断了");
            thread1.interrupt();
        }
        System.out.println("子线程运行完毕");
    }
}
