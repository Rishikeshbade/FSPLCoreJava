package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EntrySetExample {

    public static void main(String[] args) {

        Map<Integer, String> mp = new HashMap<>();

        mp.put(3, "Sham");
        mp.put(9, "Rahul");
        mp.put(5, "Pranita");
        mp.put(1, "Shivani");

        
        for (Map.Entry<Integer, String> entry : mp.entrySet()) {
            System.out.println("Sr.No: "+ entry.getKey());
            System.out.println("Name: " + entry.getValue());
        }

    }
}
