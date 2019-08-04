package com.codes;

import java.util.Scanner;

public class PrimeNumber {
	private void isPrime()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked ");
		int num = sc.nextInt();
		int flag =0;
		if  (num <=1)
		{
			System.out.println("Number is not valid");
		}
		else if (num ==2)
		{
			System.out.println("Number is prime");
			
		}
		
		else if(num %2==0)
		{
			System.out.println("Number is not  prime");
		}
		else {
			for (int i =3; i <= Math.sqrt(num); i=i+2)
			{
				if (num % i == 0)
				{
					flag =1;
					break;
				}
			}
			
			if (flag == 0)
			{
				System.out.println("The entered number is prime");
			}
			else
			{
				System.out.println("The entered number is not prime");
			}
		
		}
		/*
		 * if (flag == 0) { System.out.println("The entered number is prime"); } else {
		 * System.out.println("The entered number is not prime"); }
		 */
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pn = new PrimeNumber();
		pn.isPrime();
	}

}
