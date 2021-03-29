package com.imooc.singleton;

/**
 * @author fanzk
 * @version 1.8  懒汉式（线程不安全）（不推荐）
 * @date 2020/7/19 13:17
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
