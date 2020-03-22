package com.google.anil;

import java.util.Arrays;

public class NumArray {
	
	public static void main(String[] args) {
		int n = 9;
		String[] arr = new String[n];
		int len = DecimalToBinary.converter(n).length();
		System.out.println(len);
		for(int i=0;i<arr.length;i++) {
			arr[i] = DecimalToBinary.converter(i);
		}
		System.out.println("Final -> "+Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length;i++) {
			int val = arr[arr.length-1].length()-arr[i].length();
			arr[i] = "0".repeat(val)+arr[i];
		}
		System.out.println("Final -> "+Arrays.toString(arr));
	}

}
