package imooc.threads.chapter07.DiscardOldestPolicy;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        // 创建线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1, 1, 0L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(2),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        try {
            // 提交任务
            threadPool.execute(new Task(1));
            threadPool.execute(new Task(2));
            threadPool.execute(new Task(3));
            threadPool.execute(new Task(4));
        } catch (RejectedExecutionException e) {
            e.printStackTrace();
        } finally {
            // 关闭线程池
            threadPool.shutdown();
        }
    }
}