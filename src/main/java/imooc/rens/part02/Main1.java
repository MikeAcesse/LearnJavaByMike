package imooc.rens.part02;

public class Main1 {
    public static void main(String[] args) {
        //创建Task1 实例
        Task1 task = new Task1();
        //创建线程
        Thread thread = new Thread(task);
        thread.start();
    }
}
