package com.codes;

import java.util.Scanner;

public class BubbleSort {

	private void bSort(int arr[]) {
		boolean swapped = false;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the lenth of array: ");
		int n = arr.length;
//
//		int[] arr = new int[n];
//		System.out.println("Enter the array ");
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <  n- 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;

//					arr[i] = arr[i] + arr[j];
//					arr[j] = arr[i] - arr[j];
//					arr[i] = arr[i] - arr[j];

					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		System.out.println("Output is ");
		for (

			int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

//		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {1,2,7,6,5,4,3};
		int [] num1 = {1,2,3,9};
		BubbleSort bs = new BubbleSort();
		bs.bSort(num);
		bs.bSort(num1);
	}

}
