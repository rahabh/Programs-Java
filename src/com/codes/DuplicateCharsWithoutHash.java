package com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCharsWithoutHash {
	static int noOfChars = 256;
	public void dupCharWithoutHash() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String sOriginal = sc.nextLine();
		
		int [] count = new int [noOfChars];
		
		Arrays.fill(count, 0);
		
		int i;
		int total = 0;
		for (i =0; i<=sOriginal.length()-1; i++ ) {
			count[sOriginal.charAt(i)]++;
			
			total =count[sOriginal.charAt(i)];
			
			if ((!Character.isWhitespace(sOriginal.charAt(i)) && (total >1)))
			{
				System.out.println("count of " +sOriginal.charAt(i) + " is " + total );
			}
		}
	}
	public static void main(String[] args) {
		DuplicateCharsWithoutHash dg= new DuplicateCharsWithoutHash();
		dg.dupCharWithoutHash();

	}

}
