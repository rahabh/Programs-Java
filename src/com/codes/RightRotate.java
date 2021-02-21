package com.codes;

import java.util.Scanner;

public class RightRotate {
	public void rightRotate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len = sc.nextInt();
		
		System.out.println("Enter the number of right rotation");
		int nr= sc.nextInt();
		
		int [] arr = new int [len];
		System.out.println("Fill the array");
		for (int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		int [] temp = new int [arr.length];
		
		for (int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		
		for (int i=0; i<len; i++) {
			if ((i+nr) < len) {
				arr[i] = temp[i+nr];
			}
			else
			{
				arr[i] = temp[len-(i+nr)];
			}
		}
		
		System.out.println("Resulted array with "+ nr + " of right rotation is");
		for (int i=0;i<len;i++) {
			System.out.print(arr[i]+ " ");
		}
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightRotate rr = new RightRotate();
		rr.rightRotate();

	}

}
