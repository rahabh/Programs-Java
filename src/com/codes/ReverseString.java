package com.codes;
import java.util.Scanner;

public class ReverseString {

	private void rSting()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		
//		for (int i = ch.length - 1; i >= 0; i--) {
//			rev = rev + ch[i];
//		}
//		System.out.println("Reverse of string " + s + " is " + rev);
//		sc.close();
		
		
		for (int i=0, j=ch.length-1;i<j;i++,j--)
		{
			ch[i] = s.charAt(j);
			ch[j] = s.charAt(i);
		
			
		}
	
		String revs = new String (ch);
		
		
		System.out.println("Reverse of string " + s + " is " + revs);
		sc.close();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs= new ReverseString();
		rs.rSting();
	}

}
