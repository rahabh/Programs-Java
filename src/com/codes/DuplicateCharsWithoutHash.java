package com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateCharsWithoutHash {
	static int noOfChars = 256;
	public void dupCharWithoutHash() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String sOriginal = sc.nextLine();
		String sOriginalSmall = sOriginal.toLowerCase();
		
		int [] count = new int [noOfChars];
		
		Arrays.fill(count, 0);
		
		int i;
		int total = 0;
		for (i =0; i<=sOriginalSmall.length()-1; i++ ) {
			count[sOriginalSmall.charAt(i)]++;
			
			total =count[sOriginalSmall.charAt(i)];
			
			if ((!Character.isWhitespace(sOriginalSmall.charAt(i)) && (total >1)))
			{
				System.out.println("count of " +sOriginalSmall.charAt(i) + " is " + total );
			}
		}
		
//		for (i =0; i<=sOriginalSmall.length()-1; i++ ) {
//			if ((!Character.isWhitespace(sOriginalSmall.charAt(i)) && (total >1)))
//			{
//				System.out.println("count of " +sOriginalSmall.charAt(i) + " is " + total );
//			}
//		}

	}
	public static void main(String[] args) {
		DuplicateCharsWithoutHash dg= new DuplicateCharsWithoutHash();
		dg.dupCharWithoutHash();

	}

}
