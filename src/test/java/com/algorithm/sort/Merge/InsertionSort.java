package com.algorithm.sort.Merge;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/4/13 18:05
 */
public class InsertionSort {
	//我们的算法类不允许产生任何实例
	private InsertionSort() {
	}
	public static void sort(Comparable[] arr){
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			Comparable e = arr[i];
			int j = i;
			for (; j>0 && arr[j-1].compareTo(e) > 0;j--) {
				arr[j] = arr[j-1];

			}
			arr[j] = e;
		}
	}
	private static void swap(Object[] arr,int i,int j){
		Object t =arr[i];
		arr[i]=arr[j];
		arr[j] = t;
	}
    // 测试InsertionSort
	public static void main(String[] args) {
		int N = 10000;
		Integer[] arr = null;
	}
}