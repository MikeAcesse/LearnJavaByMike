package com.imooc.uncaughtexception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/7/8 9:20
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private String name;

    public MyUncaughtExceptionHandler(String name) {
        this.name = name;
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.WARNING, "线程异常，终止了 " + t.getName());
        System.out.println(name + " 捕获了异常，" + t.getName() + "异常");
    }
}
