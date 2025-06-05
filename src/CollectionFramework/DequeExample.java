package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Banana");
		deque.add("Apple");
		deque.add("Orange");
		deque.add("Mango");
		
		System.out.println("Original Deque: "+deque);
		
		deque.offer("Grapes");
		System.out.println("After offer: "+deque);
		
		deque.offerFirst("Cherry");
		System.out.println("After Offer first: "+deque);
		
		deque.offerLast("Litchy");
		System.out.println("After Offer Last: "+deque);
		
		System.out.println("Remove: "+deque.remove("Litchy"));
		System.out.println("After Remove: "+deque);
		
		System.out.println("Contain Elements: "+deque.contains("Apple"));
		
		System.out.println("Poll First: "+deque.pollFirst());
		System.out.println(deque);
		
		System.out.println("Poll Last: "+deque.pollLast());
		System.out.println(deque);
		
		System.out.println("Peek First: "+deque.peekFirst());
		System.out.println(deque);
		
		System.out.println("Peek Last: "+deque.peekLast());
		System.out.println(deque);
		
		
		
		

	}

}
