package imooc.rens.threadlocal;

/**
 * ThreadLocal的定位是什么？
 * 操作线程属性的工具类
 * ThreadLocal 和 Thread 的关系是什么？
 * Thread 负责存储数据
 * ThreadLocal 负责操作数据
 */
public class Main {
    public static void main(String[] args) {
        //创建ThreadLocal
        ThreadLocal<String> tl = new ThreadLocal<String>();
        //创建线程thread0
        Thread thread0 = new Thread(){
            @Override
            public void run() {
                //设置ThreadLocal在当前线程中保存的变量副本
                tl.set("Thread0");
                //获取ThreadLocal在当前线程中保存的变量副本
                System.out.println(tl.get());
            }
        };
        //创建thread1线程
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                //设置ThreadLocal在当前线程中保存的变量副本
                tl.set("Thread_fanzhikang");
                //获取ThreadLocal在当前线程中保存的变量副本
                System.out.println(tl.get());
            }
        };
        //启动线程
        thread0.start();
        thread1.start();
    }
}
