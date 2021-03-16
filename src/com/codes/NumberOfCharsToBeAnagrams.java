package com.codes;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfCharsToBeAnagrams {
	
	public void numberOfChars() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first word in lower case");
		String str1 = sc.nextLine();
		char [] ch1 = str1.toCharArray();
		
		System.out.println("Please enter two second word in lower case");
		String str2 = sc.nextLine();
		char [] ch2 = str2.toCharArray();
		
		int count =0;
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		HashMap<Character,Integer> hm1 = new HashMap<Character,Integer>();
		
		for(Character c : ch1) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c, 1);
			}
		}
		
		for (Character c1: ch2) {
			if (hm1.containsKey(c1)) {
				hm1.put(c1, hm1.get(c1) -1);
			}
			else {
				hm1.put(c1, 1);
			}
		}
		System.out.println("String1 : " + hm);
		System.out.println("String2 : " + hm1);
		
		// Iterate each chars of string 1 in map of string 2 
		// if char matches in map of string 2 then decrease the count of map of string by 1
		// if the value becomes zero then remove it from map
		// if the value doesnot macth , dont do anything
		// Do the same process for string 2 in the map of string 1
		  
		int count1 =0;
		for (Character c12 : ch1) {
			if (hm1.containsKey(c12)) {
				System.out.println("c12 : " + c12);
				count = hm1.get(c12);
				count = count -1;
				//count1++;
				if (count ==0) {
					hm1.remove(c12);
				}
				else {
					hm1.put(c12, count);
					//count1++;
				}
			}
		}
		count1 = str1.length()-hm1.size();
		
		for (Character c21 : ch2) {
			if (hm.containsKey(c21)) {
				System.out.println("c21 : " + c21);
				count = hm.get(c21);
				count = count -1;
				//count1++;
				if (count ==0) {
					hm.remove(c21);
				}
				else {
					hm.put(c21, count);
					//count1++;
				}
			}
		}
		//count1 += str2.length()- hm1.size();
		System.out.println("count : " + count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfCharsToBeAnagrams numberOfCharsToBeAnagrams = new NumberOfCharsToBeAnagrams();
		numberOfCharsToBeAnagrams.numberOfChars();

	}

}
