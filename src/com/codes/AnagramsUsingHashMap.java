package com.codes;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramsUsingHashMap {
	
	private boolean isAnagram() {
		
		boolean result=false;
	
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the first string");
		String s1= sc.nextLine();
		
		System.out.println("Enter the second string");
		String s2= sc.nextLine();
		
		String s1a = s1.toLowerCase();
		char[] ch1 = s1a.toCharArray();
		String s2a= s2.toLowerCase();
		char[] ch2= s2a.toCharArray();
		
		HashMap<Character,Integer> h1= new HashMap<Character,Integer>();
		HashMap<Character,Integer> h2= new HashMap<Character,Integer>();
		
		for (Character ch1a : ch1) {
			if (h1.containsKey(ch1a)) {
				h1.put(ch1a, h1.get(ch1a)+1);
			}
			else {
			h1.put(ch1a, 1);
			}
		}
		
		for (Character ch1b: ch2) {
			if (h2.containsKey(ch1b)) {
				h2.put(ch1b, h2.get(ch1b)+1);
			}
			else {
				h2.put(ch1b, 1);
			}
		}
		
		if (h1.equals(h2)) {
			System.out.println("Anagram");
			return result;
		}
		else {
			System.out.println("No Anagrams");
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramsUsingHashMap anagramsUsingHashMap = new AnagramsUsingHashMap();
		anagramsUsingHashMap.isAnagram();
	}

}
