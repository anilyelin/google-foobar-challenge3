package com.google.anil;

import java.util.Arrays;

public class Solution {
	
	public static int solution(int start, int length) {
		String[] arr = new String[(length*length)];
		for(int i=start;i<arr.length;i++) {
			arr[i] = converter(i);
		}
		numarray(arr);
		String s = arraysplit(length,arr);
		System.out.println();
		for(int i=start;i<arr.length;i++) {
			//System.out.println(arr[i]);
		}
		int decimal=Integer.parseInt(s,2);
		return decimal;
	
	}
	
	public static void main(String[] args) {
		System.out.println(Solution.solution(0,3));
	}
	public static String converter(int n) {
		StringBuilder sb = new StringBuilder();
		int wert = n;
		int res1 = wert/2;
		
		while(true) {
			int temp = wert%2;
			sb.append(temp);
			wert = res1;
			res1 = wert/2;
			if(wert==0) {
				break;
			}
		}
		String result = sb.reverse().toString();
		return result;
	}
	
	public static void numarray(String[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			
			int val = arr[arr.length-1].length()-arr[i].length();
			arr[i] = "0".repeat(val)+arr[i];
		}
	}
	public static String arrayxor(String[] arr) {
		String result = arr[0];
		String[] temp = new String[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			String first = arr[0];
			first = elemxor(first,arr[i+1]);
			arr[i] = first;
			result = first;
			temp[i] = result;
		}
		return result;
	
	}
	public static String elemxor(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			int a = s1.charAt(i)^s2.charAt(i);
			sb.append(a);
		}
		return sb.toString();
		
	}
	public static String arraysplit(int n,String[] arr) {
		String[] res = new String[n];
		for(int i=0;i<n;i++) {
			String[] temp = Arrays.copyOfRange(arr, i*n, (i+1)*(n-1)+1);
			//System.out.println(Arrays.toString(temp));
			res[i] = arrayxor(temp);
			
		}
	
		return arrayxor(res);
		
	}

}
