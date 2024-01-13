package collection;

import java.util.Collection;
import java.util.HashMap;

public class HashMap_001 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// To add Values
		map.put(1, "ab");
		map.put(5, "cd");
		map.put(3, "cd");
		map.put(6, "za");
		map.put(8, "xy");
		map.put(9, "io");
		map.put(18, "ui");
		map.put(76, "gh");
		map.put(76, "op");
		
		//To print All Values
		//System.out.println(map);
		
		//To get size of hashmap
		System.out.println(map.size());
		
		//To remove any value
		//map.remove(6);
		//map.remove(18, "ui");
		//System.out.println(map);
		
		// To replace any value
		map.replace(1, "hjk");
		map.replace(9, "io", "mn");
		System.out.println(map);

		// To get values without key
		Collection<String> k = map.values();
		//System.out.println(k);
		
		// To clear values
		//map.clear();
		//System.out.println(map);

		// To create duplicate copy
		System.out.println(map.clone());
	}

}
