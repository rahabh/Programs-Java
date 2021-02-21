package com.codes;

import java.util.Scanner;

public class FloatReverse {

	public void floatReverse() {
		Scanner sc=  new Scanner(System.in);
		System.out.println("Please enter the number");
		Double num = sc.nextDouble();
		int count =0;
		
//		Get int value
		Double newNum = num;
		int newInt= newNum.intValue();
		
//		Count the digit of int
		int digitCount=0;
		while(newInt !=0) {
			newInt = newInt/10;
			++digitCount;
		}
		
//		Eliminate decimal places until 0 is reached
		for (int i=0;i< 10; i++) {
			newNum = newNum*10;
			count ++;
			if (isIntegers(newNum)) {
				break;
			}
		}
//		Convert double in to int
		int data = newNum.intValue();
		
		int copyData = data;
		int newData =0;
		
		while (copyData >0) {
			int rem = copyData % 10;
			newData = newData*10 + rem;
			copyData = copyData/10;
		}
//		System.out.println("Reverse integer is " + newData);
		int powerOfTen =10;
//		
		for (int i=0;i<digitCount-1;i++) {
			 powerOfTen= powerOfTen*10;
		}

//		System.out.println("Power of 10 is " + powerOfTen );
//		 
		Double rever = (double) newData / powerOfTen;
		System.out.println("Reverse of double " + num +" is " + rever);
	}
	
	public boolean isIntegers(double num) {
		boolean result = false;
		if (num % 1==0) {
			result = true;
//			System.out.print(result);
		}
		else {
			result = false;
//			System.out.print(result);
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloatReverse f = new FloatReverse();
		f.floatReverse();

	}

}
