package com.codes;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccUsingHM {

	public int maxOccUsingHM() {
		int count = 0;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();

		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (Character c : ch) {
			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);
				count++;
				System.out.println("Count is : " + count);
				if (count >= max) {
					max = count +1;

				}
			} 
			else {
				hm.put(c, 1);
			}
		}

		System.out.println("max count is : " + max);

		return max;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxOccUsingHM mx = new MaxOccUsingHM();
		mx.maxOccUsingHM();
	}

}
