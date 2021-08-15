package imooc.rens.part01;

public class Main1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println(1);
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println(2);
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                System.out.println(3);
            }
        };
      thread1.start();
      thread2.start();
      thread3.start();
    }
}
