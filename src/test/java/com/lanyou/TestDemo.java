package com.lanyou;

/**
 * @author fanzk
 * @version 1.8
 * @date 2020/9/17 17:13
 */
public class TestDemo {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6};
		for(int elem:arr){
			System.out.print(elem + ",");
		}
		// 打印反转后的元素
		arr = reverse(arr);
		System.out.println();
		for(int elem:arr){
			System.out.print(elem + ",");
		}
	}
	// 实现数组元素的翻转
	public static int[] reverse(int[] arr){
		// 遍历数组
		for(int i = 0;i < arr.length / 2;i++){
			// 交换元素
			int temp = arr[arr.length -i - 1];
			arr[arr.length -i - 1] = arr[i];
			arr[i] = temp;
		}
		// 返回反转后的结果
		return arr;
	}

	// 第二种方式
	public static int[] reverse1(int[] arr){
		int[] arr1 = new int[arr.length];
		for(int i = arr.length-1;i >= 0;i--){
			arr1[arr.length-i-1] = arr[i];
		}
		return arr1;
	}

}
