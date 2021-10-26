package imooc.rens.threadlocal2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(1);
        //创建ThreadLocal
        ThreadLocal<String> tl = new ThreadLocal<>();
        //创建任务
        Runnable task = new Runnable() {
            @Override
            public void run() {
                //获取当前线程名称
                String name = Thread.currentThread().getName();
                //输出当前线程名称
                System.out.println("设置的数据："+name);
                //设置线程本地变量
                tl.set(name);
                //创建提交给线程池的任务
                Runnable r = new Runnable() {

                    @Override
                    public void run() {
                        //输出线程本地变量
                        System.out.println("获取的数据："+tl.get());
                    }
                };
                //提交任务
                threadPool.execute(r);
            }
        };
        //创建线程
        Thread thread0 = new Thread(task);
        Thread thread1 = new Thread(task);
        //启动线程
        thread0.start();
        thread1.start();
    }
}
