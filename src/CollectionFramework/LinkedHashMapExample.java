package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(3, "Mango");
		map.put(9, "Grapes");
		map.put(8, "Orange");
		map.put(4, "Banana");
		map.put(null, null);
		map.put(null, null);
		
		System.out.println("Original LinkedHashMap: "+map);
		
		//updating an array
		map.put(3, "Apple");
		System.out.println("After Updating Key 3: "+map);
		
		//Accessing Elemnts
		System.out.println("Value for key 8: "+map.get(8));
		System.out.println("Value for key 5: "+map.getOrDefault(5, null));
		
		//Checking Key and value
		
		System.out.println("Contain Key 3?: "+map.containsKey(3));
		System.out.println("Contain value ?: "+map.containsValue("Banana"));
		
		//remove
		map.remove(3);
		map.remove(8, "Orange");
		System.out.println("AfterRemoving: "+map);
		
		
		//Using Iterator
		System.out.println("Using Iterator EntrySet: ");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " => "+entry.getValue());
		}
		
		//clear
		map.clear();
		System.out.println("After clear: "+map);

	}

}
