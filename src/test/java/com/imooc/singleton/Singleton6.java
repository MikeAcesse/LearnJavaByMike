package com.imooc.singleton;

/**
 * @author fanzk
 * @version 1.8  双重检查（推荐面试使用）
 * @date 2020/7/19 13:18
 */
public class Singleton6 {
    private volatile static Singleton6 instance;

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
