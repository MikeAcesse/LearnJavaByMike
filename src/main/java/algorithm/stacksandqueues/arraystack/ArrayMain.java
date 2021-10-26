package algorithm.stacksandqueues.arraystack;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/12 11:30
 */
public class ArrayMain {
	public static void main(String[] args) {
		Array arr = new Array();
		for (int i = 0; i < 5; i++) {
			arr.add(i,i);
		}
		System.out.println(arr);
	}
}
