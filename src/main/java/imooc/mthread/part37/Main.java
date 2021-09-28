package imooc.mthread.part37;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 11:03
 */
public class Main {
	public static void main(String[] args) {
		//创建ThreadLocal
		ThreadLocal<String> tl = new ThreadLocal<>();
		//创建thread0线程
		Thread thread0 = new Thread() {
			@Override
			public void run() {
				//设置ThreadLocal在当前线程中保存的变量副本
				tl.set("Threadfzk0");
				tl.set("1000");
				//获取ThreadLocal在当前线程中保存的变量副本
				System.out.println(tl.get());
				//删除ThreadLocal在当前线程中保存的变量副本
				tl.remove();
				//获取ThreadLocal在当前线程中保存的变量副本
				System.out.println(tl.get());
			}
		};
        // 启动线程
		thread0.start();
	}

}
