package com.codes;

import java.util.Scanner;

public class SumOfAllInputs {

	private void sumOfInputs()
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the number");
		int num= sc.nextInt();
		
		int sum =0;
		
		while (num > 0)
		{
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		
		System.out.println(sum);
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfAllInputs si =new SumOfAllInputs();
		si.sumOfInputs();
	}

}
