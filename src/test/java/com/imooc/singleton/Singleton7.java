package com.imooc.singleton;

/**
 * @author fanzk
 * @version 1.8  静态内部类方式，可用
 * @date 2020/7/19 13:21
 */
public class Singleton7 {
    private Singleton7() {
    }

    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
