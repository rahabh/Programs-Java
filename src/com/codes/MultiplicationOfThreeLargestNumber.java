package com.codes;

import java.util.Scanner;

public class MultiplicationOfThreeLargestNumber {

	public void myNumbers()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		System.out.print("Enter the array");
		for(int i=0; i<n; i++)
		{			
			arr[i]= sc.nextInt();
		}
		
		for (int i= 0; i<n; i++)
		{
			for (int j=0; j<n-1; j++)
			{
				if (arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i=0;i<n; i++)
		{
		System.out.print( arr[i] + " ");
		}
		
		int product = 0;
		if ((arr[0]*arr[1]*arr[n-1] > arr[n-3]*arr[n-2]*arr[n-1]))
		{
			product = arr[0]*arr[1]*arr[n-1];
		}
		else
		{
			product = arr[n-3]*arr[n-2]*arr[n-1];
		}
		System.out.print("Max poduct of three numbers : " +product);
		
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationOfThreeLargestNumber mn = new MultiplicationOfThreeLargestNumber();
		mn.myNumbers();

	}

}
