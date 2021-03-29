package com.imooc.singleton;

/**
 * @author fanzk
 * @version 1.8  懒汉式（线程安全）（不推荐）
 * @date 2020/7/19 13:16
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {

    }

    public synchronized static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
