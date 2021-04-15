package com.codes;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicateFromArray {

	public void removeDuplicateFromArray() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int n= sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.println("Please enter the array elements");
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
		for (int i=0;i<n;i++) {
			if (hm.get(arr[i])== null) {

				System.out.print(arr[i] + " ");
			}
			hm.put(arr[i], true);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateFromArray rm = new RemoveDuplicateFromArray();
		rm.removeDuplicateFromArray();
	}

}
