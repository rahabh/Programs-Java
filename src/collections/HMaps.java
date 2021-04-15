package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hmap = new HashMap<String,String>();
		hmap.put("1","Rahul");
		hmap.put("2", "Dhiraj");
		System.out.println(hmap);
//		for (int i=0;i<hmap.size();i++) {
//			System.out.println(hmap);
			if (hmap.containsKey("1")) {
				String name = hmap.get("1");
				System.out.println(name);
			}
//		}
			for(Map.Entry<String, String> e :hmap.entrySet() )
			{
				System.out.println(e.getKey() + "-->" +e.getValue());
			}
		
	}

}
