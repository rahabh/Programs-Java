package com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	static int numOfChars = 256;

//	private boolean anagramsCheck(String s1 , String s2) {
////		Scanner sc = new Scanner(System.in);
////		System.out.println("Enter the first string");
////		String s1 = sc.nextLine();
////
////		System.out.println("Enter the second string");
////		String s2 = sc.nextLine();
//
//		int count[] = new int[numOfChars];
//		Arrays.fill(count, 0);
//		int i;
//		if (s1.length() != s2.length()) {
//			System.out.println("strings are not anagrams as lengths are not equal");
//		} else {
//
//			// Checking count of ASCII character
//			for (i = 0; i <= s1.length() - 1; i++) {
//				count[s1.charAt(i)]++;
//				System.out.print(s1.charAt(i) + " : " + count[s1.charAt(i)] + " ");
//				count[s2.charAt(i)]--;
//				System.out.print(s2.charAt(i) + " : " + count[s2.charAt(i)] + " ");
//			}
//
//			for (i = 0; i <= s1.length() - 1; i++) {
//
//				if (count[s1.charAt(i)] != 0) {
//					System.out.println(" Not Anagrams");
//					return false;
//				}
//			}
//
//			System.out.println("Anagrams");
//
//		}
////		sc.close();
//		 return true;
//	}

	static boolean isAnagram(String a, String b) {
		// Complete the function

		boolean result = false;
		int no_of_chars = 256;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the first string");
//		String a = sc.nextLine();
//
//		System.out.println("Enter the second string");
//		String b = sc.nextLine();
		String al = a.toLowerCase();
//	    System.out.println(al);
		String bl = b.toLowerCase();
//	    System.out.println(bl);

		int count[] = new int[no_of_chars];
		int count1[] = new int[no_of_chars];
		for (int i = 0; i < count.length - 1; i++) {
			count[i] = 0;
		}

		for (int i = 0; i < count.length - 1; i++) {
			count1[i] = 0;
		}

		if (a.length() != b.length()) {
			System.out.println("Not Anagrams");
			return result = false;
		} else {
			for (int i = 0; i < al.length() - 1; i++) {
				count[al.charAt(i)]++;
//	            System.out.println("--------------------- al-----------");
//	            System.out.println(al.charAt(i) + " : " + count[al.charAt(i)]+" ");
				count[bl.charAt(i)]--;
//	            System.out.println("--------------------- bl-----------");
//	            System.out.println(bl.charAt(i) + " : " + count1[bl.charAt(i)]+" ");
			}

//			for (int i = 0; i < al.length(); i++) {
//
//				System.out.println(al.charAt(i) + " : " + count[al.charAt(i)] + " ");
//				System.out.println("-------------al------------------");
//				System.out.println(bl.charAt(i) + " : " + count[bl.charAt(i)] + " ");
//				System.out.println("--------------bl-----------------");
//			}

			for (int i = 0; i < al.length(); i++) {
//	        	System.out.println(bl.charAt(i) + " : " + count1[bl.charAt(i)]+" ");
//	        	System.out.println(al.charAt(i) + " : " + count[al.charAt(i)]+" ");
				if (count[al.charAt(i)] != 0) {
					System.out.println("Not Anagrams");
					return result = false;

				} else {
					System.out.println("Anagrams");
					return result = true;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hitler woman";
		String str2 ="woman hitler";
		String str3 ="qwerty";
		String str4 ="power";
		Anagrams anagrams = new Anagrams();
		Anagrams.isAnagram(str1,str2);
		Anagrams.isAnagram(str3,str4);
	}

}
