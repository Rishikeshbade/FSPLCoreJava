package CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		treeset.add(4);
		treeset.add(1);
		treeset.add(9);
		treeset.add(2);
		
		System.out.println("Original Treeset: ");
		
		
		//addAll()
		List<Integer> list = Arrays.asList(3, 6);
		treeset.addAll(list);
		System.out.println("After AddAll():"+treeset);
		
		
		
		//size()
		System.out.println("Size of TreeSet: "+treeset.size());
		
		
		//first
		System.out.println("First Element: "+treeset.first());
		
		//last
		System.out.println("Last Element: "+treeset.last());
		
		//ceiling
		System.out.println("Ceiling of 5: "+treeset.ceiling(5));
		
		//floor
		System.out.println("Floor of 5: "+treeset.floor(5));
		
		//higher
		System.out.println("Higher than 6: "+treeset.higher(6));
		
		//lower
		System.out.println("Lower Than 6: "+treeset.lower(6));
		
		//headset
		System.out.println("HeadSet (less than 5): "+treeset.headSet(5));
		
		//tailset
		System.out.println("Tailset (greater than 5): "+treeset.tailSet(5));
		
		//contain
		System.out.println("Contains 4 ?: "+treeset.contains(4));
		System.out.println("Contains 5 ?: "+treeset.contains(5));
		
		
		//iterator
		Iterator<Integer> itr = treeset.iterator();
		System.out.println("Element Using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		//descending iterator
		Iterator i = treeset.descendingIterator();
		System.out.println("Descending Order: ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		//pollFirst
		System.out.println("Poll First: "+treeset.pollFirst());
		
		
		//pollLast
		System.out.println("Poll Last: "+treeset.pollLast());
		
		
		//subset
		System.out.println("Subset ( 4 to 8): "+treeset.subSet(4, 8));
		 
		
		//comparator
		Comparator<? super Integer> comparator = treeset.comparator();
		System.out.println("Comparator: " + (comparator != null ? comparator : "Natural Ordering"));
		
		//remove
		treeset.remove(1);
		System.out.println("After Removing Element 1: "+treeset);
		
		//cloned
		treeset.clone();
		System.out.println("Cloned Treeset: "+treeset);
		
		
		//clear
		treeset.clear();
		System.out.println("After Clearing, Treeset: "+treeset);

	}

}
