package CollectionFramework;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Orange");
		list.add("Balck");
		list.add("Yellow");
		
		list.addFirst("Red");
		list.addLast("Green");
		list.removeFirst();
		//list.clear();
		
		
		System.out.println(list);
		
		System.out.println("PeekFirst: "+list.peekFirst());
		
		System.out.println("Peek Last: "+list.peekLast());
		
		System.out.println("Get First : "+list.getFirst());
		
		System.out.println("Get Last : "+list.getLast());
		
		System.err.println("Remove Last : "+list.removeLast());
		
		System.out.println("Add All : "+list.addAll(list));
		
		list.set(2, "Blue");
		System.out.println("After Setting"+list);

	}

}
