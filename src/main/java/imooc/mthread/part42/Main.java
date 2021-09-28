package imooc.mthread.part42;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/9/28 10:16
 */
public class Main {
	public static volatile  int i = 0;
	public static void main(String[] args) {
		//创建线程
		Thread thread = new Thread() {
			@Override
			public void run() {
				//内存值
				int oldValue = i;
				System.out.println("内存值： "+oldValue);
				try {
					Thread.sleep(100); // 使当前线程休眠100毫秒
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//修改i的值
				boolean result = compareAndSwap(i,oldValue,i + 1);
				System.out.println("设置是否成功： "+ result);
				System.out.println("新值： "+ i);
			}
		};
		// 启动线程
		thread.start();
		try {
			Thread.sleep(100); // 使当前线程休眠100毫秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//干扰
		i = 100;

	}

	/**
	 * 比较并交换
	 * @param oldValue 旧值
	 * @param expectedValue 预期原值
	 * @param newValue 新值
	 * @return 设置成功返回true ,否则返回false
	 */
	public static boolean compareAndSwap(int oldValue, int expectedValue, int newValue) {
	  //当预期原值等于旧值时
		if(expectedValue == oldValue){
			//将新值赋给内存值
			i = newValue;
			//设置成功
			return true;
		}
		//设置失败
		return false;
	}
}
