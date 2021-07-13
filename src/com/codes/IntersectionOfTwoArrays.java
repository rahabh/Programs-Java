package com.codes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {

	public void intersectionOfTwoArrays(int [] A1 , int [] A2) {
		
		HashSet <Integer> hmA = new HashSet<Integer>();
//		HashMap <Integer, Integer> hmB = new HashMap<Integer, Integer>();
		for (int i=0;i<A1.length;i++) {
			hmA.add(A1[i]);
		}
		
		for (int i=0;i<A2.length;i++) {
				if (hmA.contains(A2[i])) {
					System.out.println(A2[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionOfTwoArrays ita = new IntersectionOfTwoArrays();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the length of the array");
		int n= sc.nextInt();
		
		int [] arr = new int [n];
		int [] arr1 = new int[n];
		System.out.println("Please enter the array elements");
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Please enter the array elements");
		for (int i=0; i<n; i++) {
			arr1[i]=sc.nextInt();
		}
		ita.intersectionOfTwoArrays(arr, arr1);

	}

}
