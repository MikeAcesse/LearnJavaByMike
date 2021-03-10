package com.imooc.stopthread;

import java.util.concurrent.Executors;

/**
 * @author fanzk
 * @version 1.8     run 无法抛出checked Exception ,只能用try /catch
 * @date 2020/7/2 13:44
 */
public class RunThrowException {
    public void aVoid() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("保存日志");
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
