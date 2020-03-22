package com.google.anil;

import java.util.Arrays;

public class arrayIn {
	
	public static void main(String[] args) {
		int[] arr = {17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
		String[] arr1 = {"0","1","2","3","4","5","6","7","8"};
//		for(int i=0;i<3;i++) {
//			int[] temp = Arrays.copyOfRange(arr1, i*3, (i+1)*2+1);
//			System.out.println(Arrays.toString(temp));
//		}
		//arrayIn.arraysplit(4, arr);
		arrayIn.arraysplit(3,arr1);
		
		
	}
	
	public static void arraysplit(int n,String[] arr) {
		for(int i=0;i<n;i++) {
			String[] temp = Arrays.copyOfRange(arr, i*n, (i+1)*(n-1)+1);
			System.out.println(Arrays.toString(temp));
		}
		
	}
	

}
