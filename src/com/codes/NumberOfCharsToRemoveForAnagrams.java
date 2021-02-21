package com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfCharsToRemoveForAnagrams {
	
	final static  int chars=26;
	public int charCount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first word in lower case");
		String wrd1 =sc.nextLine();
		
		System.out.println("Please enter second word in lower case");
		String wrd2= sc.nextLine();
		
		int [] arr = new int [chars];
		Arrays.fill(arr,0);
		
		for (int i=0; i<wrd1.length();i++) {
			arr[wrd1.charAt(i) -'a']++;
		}
		
		for (int i=0; i<wrd2.length();i++) {
			arr[wrd2.charAt(i) -'a']--;
		}
		
		int count =0;
		for (int i=0; i< chars; i++) {
			count += Math.abs(arr[i]);
		}
		System.out.println("Total number of count is " + count);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfCharsToRemoveForAnagrams numberOfCharsToRemoveForAnagrams = new NumberOfCharsToRemoveForAnagrams();
		numberOfCharsToRemoveForAnagrams.charCount();
	}

}
