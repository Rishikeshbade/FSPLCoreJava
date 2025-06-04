package CollectionFramework;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(2, "Orange");
		map.put(8, "Grape");
		map.put(4, "Banana");
		map.put(6, null);

		System.out.println(map);

		// Using keyset
		System.out.println("Using KeySet: ");
		for (Integer val : map.keySet()) {
			System.out.println("Key Element: " + val);
			System.out.println("Value for key: " + map.get(val));
		}

		// Using EntrySet
		System.out.println("Using EntrySet: ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key Element:- " + entry.getKey());
			System.out.println("Value for Key:- " + entry.getValue());
		}

		// using iterator
		System.out.println("Using Iterator: ");
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key Element: " + entry.getKey());
			System.out.println("Value for Key: " + entry.getValue());
		}

	}

}
