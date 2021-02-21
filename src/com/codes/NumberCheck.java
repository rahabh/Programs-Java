package com.codes;

public class NumberCheck {
	public boolean isIntegers(double num) {
		boolean result = false;
		if (num % 1==0) {
			result = true;
			System.out.print(result);
		}
		else {
			result = false;
			System.out.print(result);
		}
			
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCheck nan =new NumberCheck();
		nan.isIntegers(123);
	}

}
