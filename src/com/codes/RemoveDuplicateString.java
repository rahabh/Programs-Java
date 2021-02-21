package com.codes;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicateString {
	public void removeDuplicate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the word(s)");
		String str= sc.nextLine();
		String newStr=new String();
		char[] ch=str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		for(Character c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
				if (hm.get(c)==1) {
					newStr = newStr + c;
				}
			}
			else {
				hm.put(c, 1);
				newStr = newStr + c;
			}
		}
		System.out.println("New String :" + newStr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateString removeDuplicateString = new RemoveDuplicateString();
		removeDuplicateString.removeDuplicate();

	}

}
