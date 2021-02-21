package com.codes;

import java.util.Scanner;

public class LeftRotate {
	
	public void leftRotate() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the legth of array");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of left rotation");
		int nr = sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.println("Fill the array");
		for (int i=0;i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int [] temp =new int [arr.length];
;		
		for (int i=0; i<n; i++) {
			temp[i] = arr[i];
		}
		
		int nf = 0;
			
		if (nr > n) {
			nf = nr % n;
		}
		else {
			nf = nr;
		}
		
		for (int i=0; i<n; i++) {
			
			if ((i+nf) < n){
				arr[i] = temp[i+nf];
			}
			else {
				arr[i] = temp[(i+nf) -n];
			}
				
		}
		
		System.out.println("Resulted output with " + nr + " of rotaion is ");
		
		System.out.println("Fill the array");
		for (int i=0;i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeftRotate lr = new LeftRotate();
		lr.leftRotate();

	}

}
