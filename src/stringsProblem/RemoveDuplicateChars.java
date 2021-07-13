package stringsProblem;

import java.util.HashMap;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java++++";
		String newStr = "";
		HashMap<Character,Boolean> hm = new HashMap<Character,Boolean>();
		for(Character ch : str.toCharArray()) {
			if (hm.get(ch) == null) {
				newStr = newStr + ch;
			}
				hm.put(ch, true);
			
		}
		System.out.println(newStr);
	}

}
