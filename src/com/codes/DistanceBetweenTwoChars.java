package com.codes;

public class DistanceBetweenTwoChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Ajay is here";
		char c1 ='h';
		char c2 = 'y';
		int dist =0;
		System.out.println("str_len " + str.length());
		int c1n = str.indexOf(c1);
		System.out.println(str.indexOf(c1n));
		int c2n = str.indexOf(c2);
		System.out.println(str.indexOf(c2));
		if (c1n==-1 | c2n==-1) {
			System.out.println("any or both char is not found.");
		
		}
		else {
			if (c2n >= c1n) {
			dist = c2n - c1n;
			System.out.println(dist);
			}
			else {
			dist = str.length() - (c1n -c2n);
			System.out.println(dist);
			}
		}
		
	}

}
