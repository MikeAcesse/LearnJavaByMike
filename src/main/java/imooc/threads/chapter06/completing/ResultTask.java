package imooc.threads.chapter06.completing;


import java.util.concurrent.Callable;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/8/2 14:37
 */
public class ResultTask implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		//计数器
		int i = 0;
		//当前线程没被中断时
		while(!Thread.interrupted()){
			//递增
			i++;
		}
		//输出i
		System.out.println(i+"re");
		// 返回1+1的值
		return 1 + 1;
	}
}
