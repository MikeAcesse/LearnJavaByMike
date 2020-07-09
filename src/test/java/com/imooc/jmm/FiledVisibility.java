package com.imooc.jmm;

/**
 * @author fanzk
 * @version 1.8   演示可见性带来的问题
 * @date 2020/7/9 16:36
 */
public class FiledVisibility {
	volatile  int a = 1;
	volatile  int b = 2;
	private void change(){
		a =3;
		b=a;
	}
	private void print(){
		System.out.println("b= "+b+";a= "+a);
	}

	public static void main(String[] args) {
		while (true){
			FiledVisibility test = new FiledVisibility();
			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					test.change();
				}
			}).start();


			new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					test.print();
				}
			}).start();
		}
	}
}
