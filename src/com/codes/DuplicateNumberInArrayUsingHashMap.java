package com.codes;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumberInArrayUsingHashMap {
	
	public void duplicateNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int n = sc.nextInt();
		
		int [] arr= new int[n];
		System.out.println("Enter the array number");
		for (int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		int [] temp = new int[n];
		int j=0;
 		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for (Integer x : arr) {
			if (hm.containsKey(x)) {
				hm.put(x, hm.get(x)+1);
				if (hm.get(x)==1) {
					temp[x]= arr[x];
				}
			}
			else {
				hm.put(x,1);
				temp[x]= arr[x];
			}
		}

		
		Set<Integer> inte = hm.keySet();
		for (Integer i : inte) {
			if (hm.get(i)>1) {
				System.out.println(i +" --- > > "+ hm.get(i) );
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateNumberInArrayUsingHashMap duplicateNumberInArray = new DuplicateNumberInArrayUsingHashMap();
		duplicateNumberInArray.duplicateNumber();
	}

}
