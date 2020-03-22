package com.google.anil;

import java.util.Arrays;

public class ArrayXOR {
	
	public static void main(String[] args) {
		
		String[] arr = {"0011", "0111", "0111"};
		String[] temp = new String[arr.length];
		String result = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			//String first = elemxor(arr[i],arr[i+1]);
			String first = arr[0];
			first = elemxor(first,arr[i+1]);
			arr[i] = first;
			result = first;
			temp[i] = result;
		}
		System.out.println(result);
		
		
	}
		
		
	public static String elemxor(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			int a = s1.charAt(i)^s2.charAt(i);
			sb.append(a);
		}
		return sb.toString();
		
	}

}
