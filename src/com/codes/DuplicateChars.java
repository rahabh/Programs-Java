package com.codes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateChars {

	public void dupsChar()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the characters");
	String s = sc.nextLine();
	String s1 = s.toLowerCase();
	
	char [] ch =s1.toCharArray();
	
	Map<Character,Integer> dupch = new HashMap<Character,Integer>();
	
	for(Character ch1 : ch)
	{
		if(dupch.containsKey(ch1))
		{
			dupch.put(ch1, dupch.get(ch1)+1);
			
		}
		else
		{
			dupch.put(ch1, 1);
		}
	}
	
	Set<Character> set = dupch.keySet();
	for (char c: set)
	{
		if(dupch.get(c) >1 && !Character.isWhitespace(c))
		{
			System.out.println("Duplicate chars are of " + c + " -----> " + dupch.get(c)  );
		}
	}
	
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateChars du = new DuplicateChars();
		du.dupsChar();
	}

}
