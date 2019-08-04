package com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static int numOfChars = 256;

	private void anagramsCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.nextLine();

		System.out.println("Enter the second string");
		String s2 = sc.nextLine();

		int count[] = new int[numOfChars];
		Arrays.fill(count, 0);
		int i;
		if (s1.length() != s2.length()) {
			System.out.println("strings are not anagrams as lengths are not equal");
		} else {
			
			// Checking count of ASCII character
			for (i = 0; i <= s1.length() - 1 ; i++) {
				count[s1.charAt(i)]++;
				System.out.print(s1.charAt(i) + ":" + count[s1.charAt(i)]);
				count[s2.charAt(i)]--;
				System.out.print(s2.charAt(i) + ":" + count[s2.charAt(i)]);
			}
			
			for (i = 0; i <=s1.length() - 1; i++) {
				
				
				if (count[s1.charAt(i)] != 0) {
					System.out.println(" Not Anagrams");
					return;
				}
			}

				System.out.println("Anagrams");
			
		}
		sc.close();
		// return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagrams anagrams = new Anagrams();
		anagrams.anagramsCheck();
	}

}
