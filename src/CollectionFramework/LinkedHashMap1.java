package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(2, "Rishi");
		map.put(null, null);
		map.put(null, null);
		
		System.out.println(map);

		/*
		 * for (int i = 1; i <= 2; i++) { System.out.println("Enter Key: "); int key =
		 * sc.nextInt();
		 * 
		 * System.out.println("Enter Values: "); String value = sc.next();
		 * 
		 * map.put(key, value);
		 * 
		 * }
		 */

		/*
		 * // Using keyset for (Integer val : map.keySet()) {
		 * System.out.println("Key Element: " + val);
		 * System.out.println("Value for key: " + map.get(val)); }
		 * 
		 * // Using EntrySet for (Map.Entry<Integer, String> entry : map.entrySet()) {
		 * System.out.println("Key Element:- " + entry.getKey());
		 * System.out.println("Value for Key:- " + entry.getValue()); }
		 * 
		 * // using iterator Iterator<Map.Entry<Integer, String>> itr =
		 * map.entrySet().iterator(); while (itr.hasNext()) { Map.Entry<Integer, String>
		 * entry = itr.next(); System.out.println("Key Element: " + entry.getKey());
		 * System.out.println("Value for Key: " + entry.getValue()); }
		 */

	}

}
