package imooc.rens.threadlocal1;

public class ThreadA extends Thread{
    public static final InheritableThreadLocal<String> tl = new InheritableThreadLocal<String>();

    @Override
    public void run() {
        //设置数据
        tl.set("renren dou shi chengxu yuan");
        //创建线程
        ThreadB threadB = new ThreadB();
        //启动线程
        threadB.start();
    }
}
