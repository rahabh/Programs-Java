package com.codes;

import java.util.Scanner;

public class Armstrongs {
	
	static boolean armstrongNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int num = sc.nextInt();
		int len = String.valueOf(num).length();
		int copyOfNum = num;
		int sum =0;
		while (copyOfNum !=0 ) {
			int lastDigit = copyOfNum % 10;
			int lastDigitToPowerOfDigit = 1;
			for (int i=0; i<=len-1; i++) {
				lastDigitToPowerOfDigit = lastDigitToPowerOfDigit*lastDigit;
//				System.out.println(lastDigitToPowerOfDigit);
			}
			sum= sum+lastDigitToPowerOfDigit;
			copyOfNum = copyOfNum/10;
//			System.out.println(sum);
			
		}
		if (sum== num) {
			System.out.println("Arms");
		}
		else {
			System.out.println("Not Arms");
		}
		sc.close();
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrongs.armstrongNumber();
	}

}
