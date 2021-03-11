package com.imooc.threadobjectclasscommonmethods;

/**
 * @author fanzk
 * @version 1.8   证明wait 只释放当前的那把锁
 * @date 2020/7/7 9:44
 */
public class WaitNotifyReleaseOwnMonitor {
    private static volatile Object resourceA = new Object();
    private static volatile Object resourceB = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA) {
                    System.out.println("ThreadA got resourceA lock");
                    synchronized (resourceB) {
                        System.out.println("ThreadA got resourceB lock");
                        try {
                            System.out.println("ThreadA releases resouceA lock");
                            resourceA.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resourceA) {
                    System.out.println("ThreadB got resouceA lock");
                    System.out.println("ThreadB tries to resourceB lock");
                    synchronized (resourceB) {
                        System.out.println("ThreadB got resourceB lock");
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }

}
