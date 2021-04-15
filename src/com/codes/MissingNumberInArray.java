package com.codes;

import java.util.Scanner;

public class MissingNumberInArray {
	public  int missingNumberInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of array");
		
		int n = sc.nextInt();
		int [] arr = new int  [n];
		
		System.out.println("Please enter the array elements");
		for (int i =0; i< n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
