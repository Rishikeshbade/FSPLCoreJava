package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEXample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(2);
		pq.add(9);
		pq.add(4);
		pq.add(7);
		//pq.add(null);
		
		System.out.println("Original Priority Queue: "+pq);
		
		System.out.println("Size: "+pq.size());
		
		System.out.println("Poll: "+pq.poll());
		
		System.out.println("Remove Element: "+pq.remove());
		
		System.out.println("Contain Elements: "+pq.contains(7));
		
		System.out.println("Peek: "+pq.peek());
		
		System.out.println("Is empty or not: "+pq.isEmpty());
		
		//pq.clear();
		//System.out.println("clear: "+pq);
		
		System.out.println(pq);
		

	}

}
