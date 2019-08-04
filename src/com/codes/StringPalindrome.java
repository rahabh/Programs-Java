package com.codes;

import java.util.Scanner;

public class StringPalindrome {
	private void sPalindrome()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s= sc.nextLine();
		String rev = "";
		int flag =0;
		/*
		 * for (int i= s.length()-1; i>=0; i--) { rev = rev + s.charAt(i); }
		 * System.out.println("Reverse number is " + rev);
		 */
		
		for(int i=0, j=s.length()-1;i<(s.length()/2); i++,j--)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				flag =1;
			}
		}
		
		if (flag ==1)
		{
			System.out.println("Entered number is palindrome");
		}
		sc.close();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome sp= new StringPalindrome();
		sp.sPalindrome();
	}

}
