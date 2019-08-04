package com.codes;

import java.io.IOException;
import java.util.Scanner;

public class WhiteSpacesInString {
 
	private void whiteSpace ()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		char [] ch = s.toCharArray();
		String newS = "";
		for (int i= 0; i<= ch.length-1; i++)
		{
			//if((ch[i] != ' ') &&	(ch[i]!= 'a'))
			if (ch[i] != ' ')
			{
				if (ch[i] == 'a')
				{
					ch[i] = 'm';			
				} 
				newS = newS + ch[i];
			}
		}
		System.out.println("expected output is " + newS);
		sc.close();
		
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		WhiteSpacesInString ws=  new WhiteSpacesInString();
		ws.whiteSpace();

	}

}
