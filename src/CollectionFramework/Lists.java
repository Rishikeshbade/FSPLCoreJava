package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> lists = new ArrayList<Integer>();
		
		
		lists.add(1);
		lists.add(3);
		lists.add(6);
		lists.add(8);
		
		
		lists.set(3, 456);
		lists.remove(1);
		
		
		//1st way to print
		//System.out.print(lists);
		
		
		
		//2nd way to print using for loop
		//for(int i = 0; i < lists.size(); i++) {
		//	System.out.println(lists.get(i));
		//}
		
		
		
		// 3rd way tp print using for each
		//for(int a : lists) {
		//	System.out.println(a);
		//}
		
		Iterator<Integer> itr = lists.iterator();
		
		
		System.out.println("Using Iterator:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
