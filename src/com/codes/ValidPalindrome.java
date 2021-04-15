package com.codes;

public class ValidPalindrome {
	
	public boolean isValidPalindrome(String str) {
		int l =0;
		int h = str.length()-1;
		str = str.toLowerCase();
		
		if (str =="" || str == null) {
			System.out.println("Error as string is null");
			return false;
		}
		
		// Compares the charactre untill they become equal
		while (l<=h) {
			char getStrL= str.charAt(l);
			char getStrH = str.charAt(h);
			
			// To check if left contains any other symbol
			if (!((str.charAt(l)>='a' && str.charAt(l) <='z') || 
					str.charAt(l) >=0 && str.charAt(l)<=9)) {
				l++;
			}
			else if (!((str.charAt(h)>='a' && str.charAt(h) <='z') || 
					str.charAt(h) >=0 && str.charAt(h)<=9)) {
				h--;
			}
			else if(getStrL == getStrH) {
				l++;
				h--;
			}
			else {
				System.out.println("Error...!!!!!!!!!!!!!!!!!!");
				return false;
			}
			
		}
		System.out.println("Pass!!!!!!!! :)");
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidPalindrome validPalindrome = new ValidPalindrome();
		validPalindrome.isValidPalindrome("0P");

	}

}
