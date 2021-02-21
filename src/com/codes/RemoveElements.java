package com.codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveElements {
	
	private void removeElement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		
//		int [] arr = new int [n];
//		System.out.println("Enter the arrary");
//		for (int i=0; i<n; i++) {
//			arr[i]= sc.nextInt();
//		}
//		
//		System.out.println("Enter the number to be removed");
//		int num = sc.nextInt();
//		
//		for (int i=0;i<n;i++) {
//			if (arr[i] != num) {
//				arr[i]= 
//			}
//		}
		System.out.println("Enter the arrary");
		ArrayList < Integer> arr = new ArrayList<Integer>(n);
		
		while(sc.hasNextInt()) {
			arr.add(sc.nextInt());
		}
		
		System.out.println("resultant output");
		
		for (int i : arr) { 
            System.out.println(i); 
        } 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElements re = new RemoveElements();
		re.removeElement();
	}

}
