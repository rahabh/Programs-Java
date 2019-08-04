package com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccurChar {
	static int numOfChars = 256;
	public void maxOccurChar() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		
		int []count = new int [numOfChars];
		Arrays.fill(count, 0);
		int total =0;
		int max =0;
		int i;
		char ch = 0;
		for (i=0; i<=s1.length()-1; i++) {
			count[s1.charAt(i)]++;
			total =count[s1.charAt(i)];
			if ((!Character.isWhitespace(s1.charAt(i))) && (total > max) )
			{
				max = total;
				ch = s1.charAt(i);
			}			
		}
		
		System.out.println("Max is " + max + " for character " + ch);
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxOccurChar m=  new MaxOccurChar();
		m.maxOccurChar();
	}

}
