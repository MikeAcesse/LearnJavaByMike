package com.algorithm;

import com.imooc.thread2.Main;
import info2soft.qa.common.util.StringUtil;

/**
 * @author fanzk
 * @version 1.8
 * @date 2021/5/19 11:20
 */
public class TestQuickSort {
	static int partition(int n[],int left,int right){
		int pivot = n[left];
		while(left < right){
			while(left < right && n[right] >=pivot){
				right--;
			}
			if(left < right){
				n[left++] = n[right];
			}
			while(left < right && n[left] <=pivot){
				left++;
			}
			if(left < right){
				n[right--] = n[left];
			}

		}
		n[left] = pivot;
		return left;
	}

	static void quickSort(int n[], int left,int right){
		int dp;
		if(left < right){
			dp = partition(n,left,right);
			quickSort(n,left,dp -1);
			quickSort(n,dp + 1,right);
		}
	}

	public static void main(String[] args) {
		//int[] n = {9,83,18,2,7,11,44,26,8,10,19};
		int[] n = {9,83,18,2,7,11};
		for (int i = 0; i < n.length; i++) {
			if(i !=n.length-1){
				System.out.print(n[i]);
				System.out.print(",");
			}else{
				System.out.print(n[i]);
			}
		}
		System.out.println();
		quickSort(n,0,5);
		for (int i = 0; i < n.length; i++) {
			if(i !=n.length-1){
				System.out.print(n[i]);
				System.out.print(",");
			}else{
				System.out.print(n[i]);
			}
		}
		System.out.println();
	}

}
