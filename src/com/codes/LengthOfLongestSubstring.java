package com.codes;

import java.util.HashMap;
import java.util.Scanner;

public class LengthOfLongestSubstring {

	@SuppressWarnings("unlikely-arg-type")
	public int lengthOfLongestSubstring () {
		int max_len =0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		
		String lstr = str.toLowerCase();
		
		char [] ch= lstr.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		int start =0;
		
		for (int i=0;i<ch.length;i++) {
			if (hm.containsKey(ch[i])) {
//				hm.put(ch[i], hm.get(ch[i]+1));
				start= Math.max(start, hm.get(ch[i]+1));
			}
			hm.put(ch[i], i);
			max_len=Math.max(max_len, i-start+1);
		}
		System.out.println("max_len is " + max_len);
		return max_len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfLongestSubstring lm = new LengthOfLongestSubstring();
		lm.lengthOfLongestSubstring();
	}

}
