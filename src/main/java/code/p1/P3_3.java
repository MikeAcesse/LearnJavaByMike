package code.p1;

import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/6/29 17:54
 */
public class P3_3 {
	static long fact(int n){ //求阶乘函数
		if(n<=1){
			return 1;
		}else{
			return n*fact(n-1); //递归
		}
	}

	public static void main(String[] args) {
		int i;
		System.out.println("请输入要求阶乘的一个整数：");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		long result = fact(i);
		System.out.println(i+"的阶乘结果是："+result);
	}
}
