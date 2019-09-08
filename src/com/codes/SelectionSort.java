package com.codes;

import java.util.Scanner;

public class SelectionSort {

	public void sorting() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of array");
		int n = sc.nextInt();

		//int min_ind = 0;

		System.out.println("please enter the array elements");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int min_ind = i;
			for (int j = 0; j < n; j++) {
				if (arr[j] < arr[min_ind]) {
					min_ind = j;
				}
				

				int temp = arr[min_ind];
				arr[min_ind] = arr[i];
				arr[i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sorting();

	}

}
