package com.imooc.thread2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.*;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/6/22 11:36
 */
public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<BigDecimal> future = (Future<BigDecimal>) es.submit(new Task("601857"));
        System.out.println(future.get());
        es.shutdown();
    }
}

class Task1 implements Callable<BigDecimal> {
    String code;

    public Task1(String code) {
        this.code = code;
    }

    @Override
    public BigDecimal call() throws Exception {
        Thread.sleep(1000);
        double d = 5 + Math.random() * 20;
        return new BigDecimal(d).setScale(2, RoundingMode.DOWN);
    }
}
