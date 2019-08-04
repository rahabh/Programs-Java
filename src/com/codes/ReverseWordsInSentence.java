package com.codes;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInSentence {

	private void rwords()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s = sc.nextLine();
		String S1 = "";
		String [] words = s.split(" ");
		System.out.println(Arrays.toString(words));
		for (int i = words.length-1; i>=0 ; i-- )
		{
			S1 = S1 + words[i] + " ";
		}
		System.out.println("Reverse is : " + S1);
		sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInSentence rs = new ReverseWordsInSentence();
		rs.rwords();
	}

}
