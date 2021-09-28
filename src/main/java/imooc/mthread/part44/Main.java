package imooc.mthread.part44;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/24 17:54
 */
public class Main {
	public static AtomicStampedReference<Integer> i = new AtomicStampedReference<>(0,0);
	public static void main(String[] args) {
        //创建线程
		Thread thread = new Thread(){
			@Override
			public void run() {
				int oldValue = i.getReference(); // 内存值
				System.out.println("内存值： "+oldValue);
				//以CAS 的方式变更变量i的值
				boolean result = i.compareAndSet(0,1,0,1);
				System.out.println("是否更新的成功： "+result);
				System.out.println("新值： "+i.getReference());

			}
		};
		// 启动线程
		thread.start();
		// 将变量i的值修改为1
		i.set(1, i.getStamp() + 1);
		// 将变量i的值修改为0
		i.set(0, i.getStamp() + 1);
	}
}
