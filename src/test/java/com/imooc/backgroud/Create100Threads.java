package com.imooc.backgroud;

/**
 * @author fanzk
 * @version 1.8  创建100个线程，用活动监视器的CPU栏目看Java线程数量的变化，10秒后线程消失了
 * @date 2020/7/9 17:43
 */
public class Create100Threads {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
