package com.codes;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		hm.put("Rahul", 1);
		hm.put("Asif", 2);
		
//		System.out.println(hm);
		
//		for(String s : hm.keySet()) {
//			System.out.println(s );
//			System.out.println(hm.get(s));
//		}
		
		for(Map.Entry<String, Integer> h:  hm.entrySet()){
			System.out.println(h.getKey() + "---" + h.getValue() );
		}
	}

}
