package imooc.rens.threadlocal1;

public class ThreadB extends Thread {
    @Override
    public void run() {
        //获取数据
        System.out.println(ThreadA.tl.get());

    }
}
