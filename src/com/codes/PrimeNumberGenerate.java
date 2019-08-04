package com.codes;

import java.util.Scanner;

public class PrimeNumberGenerate {

	public static boolean isPrime(int num1)
	{
		if ((num1 == 0 ) || num1 ==1)
		{
			return false;
		}
		if (num1>1)
		{
			for (int i=2; i<= num1/2;i++)
			{
				if (num1 % i== 0)
				{
					return false;
				}
				
			}
				
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number from where prime number will start");
		int start = sc.nextInt();
		System.out.println("Enter the second number till where prime number will end");
		int end = sc.nextInt();
		sc.close();
		System.out.println("Prime number between " + start + "and " + end + " are");
		for (int i= start; i<=end; i++)
		{
			if (isPrime(i)== true)
			{
				System.out.println(i);
			}
		}
	}

}
