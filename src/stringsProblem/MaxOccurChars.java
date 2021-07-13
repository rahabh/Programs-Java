package stringsProblem;

import java.util.HashMap;
import java.util.Set;

public class MaxOccurChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "jav++++";
		int count =0;
		int max = 0;
		char ch =0;
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(Character c : s.toCharArray()) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
				count ++;
				if (count > max) {
					max = count;
					ch = c;
				}
			}
			else {
				hm.put(c, 1);
			}
		}
	System.out.println(ch);
	Set<Character> chs = hm.keySet();
	for(Character ch1 : chs) {
		System.out.println(ch1);
	}
	}

}
