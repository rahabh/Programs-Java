package com.codes;

import java.util.Scanner;

public class RemoveClassOnTheBasisOFIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String s = sc.nextLine();
		
		System.out.println("please enter the index to be removed");
		int n = sc.nextInt();
		
		int len = s.length();
		
		String sNew = "";
		Character ch =null ;
		
		
		if (n <0 || n > len) {
			System.out.println("Could you please enter valid range");
			
		}
		else {
			for (int i=0; i< len; i++) {
				if  (i!=n) {
					sNew = sNew + s.charAt(i);
				}
				else {
					ch= s.charAt(i);
				}
			}
		}
		System.out.println("New String after removal of specifix index " + n +" of char " +ch + " is " + sNew);
		

	}

}
