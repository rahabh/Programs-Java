package com.codes;

import java.util.HashMap;

public class Test {

	public void anagramsMethod() {
		String a ="java";
		String b = new String ("java");
		boolean result = a.equals(b);
		System.out.println(result);
		boolean result1 = (a==b);
		System.out.println(result1);
		
		int [] ar = {1,2,3,4};
		int [] ar1 = {1,2,3,4};
		boolean result_ar = ar.equals(ar1);
		System.out.println("result_ar: " + result_ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String A = "aarmy";
//		String B = "yarrm";
		Test test = new Test();
		test.anagramsMethod();
	}

}
