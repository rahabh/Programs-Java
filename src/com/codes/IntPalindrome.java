package com.codes;

import java.util.Scanner;

public class IntPalindrome {

	private void intPalindrome()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		while (num > 0)
		{
			for (int i= 0; i<num; i++)
			{
				int rem = num % 10;
				rev = rev *10 + rem;
				num = num/10;
			}
		}
		System.out.println("Reverse of " + num + " : " + rev);
		if (temp == rev)
		{
			System.out.println("Number is palindrome");
		}
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPalindrome ip = new IntPalindrome();
		ip.intPalindrome();
	}

}
