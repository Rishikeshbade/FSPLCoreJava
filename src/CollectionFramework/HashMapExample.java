package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 15);
        map.put(null, 34);

        System.out.println("Original HashMap: " + map);

        // Accessing a value using get()
        int value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value);

        // Checking if a key exists using containsKey()
        boolean hasApple = map.containsKey("Apple");
        System.out.println("Contains key 'Apple': " + hasApple);

        // Checking if a value exists using containsValue()
        boolean hasValue20 = map.containsValue(20);
        System.out.println("Contains value 20: " + hasValue20);

        // Removing a key-value pair using remove()
        map.remove("Cherry");
        System.out.println("After removing 'Cherry': " + map);

        // Replacing a value using replace()
        map.replace("Banana", 25);
        System.out.println("After replacing value for 'Banana': " + map);

        // Iterating over the HashMap using entrySet()
        System.out.println("Iterating over entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Getting the size of the HashMap
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        // Checking if the HashMap is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);

        // Clearing the HashMap
        map.clear();
        System.out.println("After clearing: " + map);
    }
}
