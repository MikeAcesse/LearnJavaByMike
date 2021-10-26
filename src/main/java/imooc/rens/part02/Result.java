package imooc.rens.part02;


import java.util.concurrent.Callable;

/**
 * 自定义任务
 */
public class Result implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "将要执行的任务写在call方法里面并返回执行结果。";
    }
}
