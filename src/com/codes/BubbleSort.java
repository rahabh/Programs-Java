package com.codes;

import java.util.Scanner;

public class BubbleSort {

	private void bSort() {
		boolean swapped = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenth of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the array ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n - 1 + i; j++) {
				if (arr[i] > arr[j]) {
//					int temp = arr[j];
//					arr[j]= arr[j+1];
//					arr[j+1] = temp;

					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];

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

		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BubbleSort bs = new BubbleSort();
		bs.bSort();
	}

}
