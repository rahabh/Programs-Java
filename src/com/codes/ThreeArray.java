package com.codes;

import java.util.Arrays;

public class ThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 =  {1,2,3};
		int [] arr2 =  {2,2,3};
		int [] arr3 =  {3,3,3};
		int [] arr = new int [arr1.length + arr2.length + arr3.length];
		Arrays.fill(arr, 0);
		for(int i=0;i<arr1.length;i++) {
			arr[i] = arr1[i];
		}
		
		for (int i=0;i<arr2.length;i++) {
			arr[i+arr1.length] = arr2[i];
		}
		
		for (int i=0;i<arr3.length;i++) {
			arr[i+arr1.length+arr2.length] = arr3[i];
		}
		
		for (int i=0;i<(arr1.length + arr2.length + arr3.length);i++) {
			System.out.println(arr[i]);
		}
	}

}
