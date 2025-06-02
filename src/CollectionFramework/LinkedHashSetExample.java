package CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		hs.add(2);
		hs.add(8);
		hs.add(2);
		hs.add(0);
		hs.add(4);
		hs.add(null);
		
		System.out.println(hs);
		

	}

}
