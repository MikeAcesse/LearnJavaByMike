package com.imooc.stopthread;

/**
 * @author fanzk
 * @version 1.8           如果while 里面放try/catch ，会导致中断失效
 * @date 2020/7/2 13:57
 */
public class CantInterrupt {
	public static void main(String[] args) throws InterruptedException {
           Runnable runnable = () ->{
           	int num =0;
           	while (num <=2000 ){
           		if(num % 100 ==0){
		            System.out.println(num + "是100的倍数");
	            }
           		num++;
	            try {
		            Thread.sleep(10);
	            } catch (InterruptedException e) {
		            System.out.println("save log");
		            e.printStackTrace();
	            }
            }
           };
           Thread thread = new Thread(runnable);
           thread.start();
           Thread.sleep(5000);
           thread.interrupt();
	}
}
