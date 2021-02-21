package com.codes;

import java.util.Scanner;

public class LowerUpper {
	
	public void lowerUpperCase() {
		  int arr[] = new int[256]; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
//		char [] ch = str.toCharArray();
		char ch=' ';
		String result ="";
		
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i) >=  'A' && str.charAt(i) <='Z') {
				ch = (char) (str.charAt(i) + 32);
			System.out.println("ch1 " + ch);
				
			}
			else if (str.charAt(i) >='a'  &&  str.charAt(i) <= 'z') {
				ch = (char)(str.charAt(i) - 32);
				System.out.println("ch2 " + ch);
				
			}
			result= result + ch ;
		}
		System.out.println("Result " + result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerUpper lw = new LowerUpper();
		lw.lowerUpperCase();
		

	}

}
