package code.p1;

import org.yaml.snakeyaml.nodes.ScalarNode;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/6/29 17:46
 */
public class P3_2 {
	public static int fibonacci(int n){
		int t1,t2;
		if(n == 1 || n ==2){
			return 1;
		}else{
			t1 = fibonacci(n-1);
			t2 = fibonacci(n-2);
			return t1+t2;
		}
	}

	public static void main(String[] args) {
		System.out.println("递推算法求解兔子产仔的问题");
		System.out.println("请输入时间");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int num =fibonacci(n);
		System.out.println("经过"+n+"月的时间，共繁殖成"+num+"对兔子！");
	}
}
