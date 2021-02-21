package com.codes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {

	public void twoSumInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int n = sc.nextInt();
		int sum = 0;
		boolean set = false;
		System.out.println("Enter the target sum to be found");
		int targetSum = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements of " + n + " size");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		HashMap<Integer,Integer> hasMap = new HashMap<Integer,Integer>();
		for (int i=0; i< arr.length ; i++) {
			int temp = targetSum - arr[i];
			// If temp is present in hashmap then return indices
			if(hasMap.containsKey(temp)) {
				
//				System.out.println(i, hasMap.get(temp));
				//System.out.printf(i, hasMap.get(temp));
			}
		}
		
	}

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		twoSum.twoSumInArray();

	}

}
