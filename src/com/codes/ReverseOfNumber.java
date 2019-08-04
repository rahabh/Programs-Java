package com.codes;

import java.util.Scanner;

public class ReverseOfNumber {

	private void reverseNumber ()
	{
		try
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		int temp =num;
		int rev =0;
		//if (temp> 0)
		//{
			while(temp>0)
			{
				int rem = temp%10;
				rev= rev*10 + rem;
				temp = temp/10;
			}
		//}
		System.out.println("Reverse of given number " + num + " : " + rev);
		
		sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseOfNumber rn = new ReverseOfNumber();
		rn.reverseNumber();
	}

}
