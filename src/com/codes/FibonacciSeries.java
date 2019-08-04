package com.codes;

import java.util.Scanner;

public class FibonacciSeries {

	public void fibser()
	{
		Scanner  sc= new Scanner (System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();

		int num3 = 0;

		
		System.out.println("Enter the length of fibonacci series");
		int n= sc.nextInt();
		
		sc.close();
		System.out.println("Fibonacci number of " + num1 + " and " + num2 + " is");
		
		for (int i=0;i<n ; i++)
		{
			num3= num1 + num2;
			num1 = num2;
			num2 = num3;
			if (num3 < 100)
			{
				
			System.out.print(num3 + " ");			
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fb= new FibonacciSeries();
		fb.fibser();
		
	}

}
