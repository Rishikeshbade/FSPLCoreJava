package CollectionFramework;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Integer> map =  new TreeMap<String, Integer>();
		
		map.put("Raj", 3);
		map.put("Shivani", 9);
		map.put("Ashish", 5);
		map.put("Riya", 8);
		map.put("Ram", 7);
		
		System.out.println("Original TreeMap: "+map);
		
		
		
		//Accesing elements
		System.out.println("Value for Key 'Ashish': "+map.get("Ashish"));
		
		//checking for keys and values
		System.out.println("Contains key 'Ashish'?: "+map.containsKey("Ashish"));
		System.out.println("Contain value '8'?: "+map.containsValue(8));
		
		
		//Removing
		map.remove("Ashish");
		System.out.println("After Removing: "+map);
		
		
		//size
		System.out.println("Size of Tree Map: "+map.size());
		
		
		//is empty
		System.out.println("Is Tree Empty?: "+map.isEmpty());
		
		//Iterating over values
		System.out.println("Values: ");
		for(int value : map.values()) {
			System.out.println(value);
		}
		
		//Iterating over key value pair
		System.out.println("Key-Value Pair: ");
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
			
			
		}
		
		
		//using First Key
		System.out.println("First Key: "+map.firstKey());
		
		//using last key
		System.out.println("Last Key: "+map.lastKey());
		
		//using higher key
		System.out.println("Higher Key: "+map.higherKey("Riya"));
		
		//using lower key
		System.out.println("Lower Key: "+map.lowerKey("Riya"));
		
		//using pollfirst
		System.out.println("Poll first: "+map.pollFirstEntry());
		
		//using pollLast
		System.out.println("Poll Last: "+map.pollLastEntry());
		
		
		
		
		//clear
		map.clear();
		System.out.println("Clear Map: "+map);
		

	}

}
