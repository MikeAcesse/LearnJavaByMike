package com.imooc.stopthread;

/**
 * @author fanzk
 * @version 1.8 最佳实践： catch 了 interruptedException之后的优先选择： 在方法签名中抛出异常，那么在run() 就会强制 try/catch
 * @date 2020/7/2 14:51
 */
public class RightWayStopThreadInProd implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (true && !Thread.currentThread().isInterrupted()) {

            System.out.println("go " + (i++));
            try {
                throwInMethod();
            } catch (InterruptedException e) {
                //保存日志、停止程序
                //Thread.currentThread().interrupt();
                System.out.println("save log");
                e.printStackTrace();
            }
        }
    }

    private void throwInMethod() throws InterruptedException {
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new RightWayStopThreadInProd());
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
}
