package com.google.anil;

public class DecimalToBinary {
	
	public static String converter(int n) {
		StringBuilder sb = new StringBuilder();
		int wert = n;
		int res1 = wert/2;
		
		while(true) {
			System.out.println("Value is: "+res1);
			System.out.println("Remainder is: "+wert%2);
			System.out.println();
			
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
	
	public static void main(String[] args) {
		System.out.println(DecimalToBinary.converter(14));
		
	}
}
