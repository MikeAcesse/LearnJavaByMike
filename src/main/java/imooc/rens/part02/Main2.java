package imooc.rens.part02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main2 {
    public static void main(String[] args) {
        Result result = new Result();
        FutureTask<String> futuretask = new FutureTask(result);
        Thread thread = new Thread(futuretask);
        thread.start();
        try {
            String s = futuretask.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
