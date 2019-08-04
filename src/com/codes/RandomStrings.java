package com.codes;

import java.util.Random;

public class RandomStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		 * String s = ""; Random random = new Random(); // int randomLen =
		 * 1+random.nextInt(9); for (int i = 0; i < 8; i++) { char c =
		 * alphabet.charAt(random.nextInt(52)); s+=c; }
		 */
		/*
		 * int n=6; int m = (int) Math.pow(10, n - 1); int y=new Random().nextInt(9 *
		 * m)+m; // int n1= 7799; String concats = Integer.toString(7799) +
		 * Integer.toString(y); // int x= Integer.parseInt(concats);
		 */ /* System.out.println(concats); */

		String alphabetCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alphabetSmall = "abcdefghijklmnopqrstuvwxyz";
		String specialChars = "!@#$%&*";
		String sCaps = "";
		String sSmall = "";
		String sChars = "";
		Random random = new Random();
		for (int i = 0; i < 2; i++) {
			char c = alphabetCaps.charAt(random.nextInt(26));
			sCaps += c;
		}

		for (int i = 0; i < 3; i++) {
			char c = alphabetSmall.charAt(random.nextInt(26));
			sSmall += c;
		}

		for (int i = 0; i < 1; i++) {
			char c = specialChars.charAt(random.nextInt(7));
			sChars += c;
		}

		int n = 2;
		int m = (int) Math.pow(10, n - 1);
		int y = new Random().nextInt(9 * m) + m;
		
		
		String concats =sCaps+ Integer.toString(y) + sChars + sSmall ;
		System.out.println(concats);

	}


}
