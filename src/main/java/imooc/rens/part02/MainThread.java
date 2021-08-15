package imooc.rens.part02;

public class MainThread  extends Thread {
    @Override
    public void run() {
        System.out.println("将要执行的任务写在run方法里面");
    }

    public static void main(String[] args) {
        //创建MainThread实例
        MainThread thread = new MainThread();
        thread.start();

    }
}
